package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAO {
	
	public void setInsert(ScoreDTO dto) {
		Connection conn = null; //db접속 정보 저장 객체 
		PreparedStatement pstmt = null; //sql
		
		String sql = "INSERT INTO score (idx, name, kor, eng, mat) VALUES (?, ?, ?, ?, ?)";
		
		try {
			conn = DBmanager.getInstance(); //db접속
			
			pstmt = conn.prepareStatement(sql); //sql 문을 실행하기 위한 준비
			
			pstmt.setInt(1, dto.getIdx()); //1번 ? 에 idx 값을 가져와서 int 형을 set 시켜라
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			
			pstmt.executeUpdate(); //sql 실행	
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("이미 존재하는 학번입니다.");
		} finally {
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		
	}
	
	public int countIdx() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int maxIdx = 0;
		
		String sql = "SELECT MAX(idx) + 1 as maxidx FROM score";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				maxIdx = rs.getInt("maxidx");
				maxIdx = rs.getInt(1);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return maxIdx;
	}
	
	
	//전체 검색
	public List<ScoreDTO> getScore() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		
		String sql = "SELECT * FROM score ORDER BY name DESC";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		return list;
	}
	
	public int getCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT COUNT(*) as count FROM score";
		
		int count = 0;
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<ScoreDTO> getOracle(){
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = """
			    SELECT idx, name, kor, eng, mat, 
			           (kor + eng + mat) AS total, 
			           (kor + eng + mat)/3 AS average,
			           CASE WHEN (kor + eng + mat) / 3 >= 90 THEN 'A'
			                WHEN (kor + eng + mat) / 3 >= 80 THEN 'B'
			                WHEN (kor + eng + mat) / 3 >= 70 THEN 'C'
			                ELSE 'F'
			           END AS grade
			    FROM score
			    """; //텍스트 블록 """ 개행 문자 뒤에 바로 문자열이 오면 컴파일 에러가 나므로 줄바꿈 필수!!
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("total"));
				dto.setAve(rs.getDouble("average"));
				dto.setGrade(rs.getString("grade"));
				
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<ScoreDTO> getMaxKor() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		
		String sql = "SELECT idx, name FROM score "
				+ "WHERE kor = (SELECT MAX(kor) FROM score)";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//조건 검색
	public ScoreDTO getCondition(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ScoreDTO dto = null; // (따로 한거)return 을 모든 코드 실행 후 마지막에 실행하기 위해 빈 껍데기로 선언했음.
		String sql = "SELECT * FROM score WHERE idx = ?";
		
		try {
			conn = DBmanager.getInstance();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();	
			
			if(rs.next()) { //검색된 결과가 있으면 true 반환 // rs.next()는 기본적으로 빈공간에 커서가 놓여져 있어서 반드시 호출해야함
				//if(rs.next())를 사용하는 것이 하나만 출력하는 것이라면 확실하게 보인다.
				//rs.next()를 하면 값이 들어있지 않을 경우 오류를 뿜어냄.
				//rs.next() : 검색된 결과가 있으면 첫번째 레코드 (튜플)로 이동하고
				//true 를 리턴해준다
				
				dto = new ScoreDTO();//객체 형태로 데이터를 주고 받기 위해 dto 객체를 생성한다
				dto.setIdx(rs.getInt("idx"));
				//rs가 가리키는 레코드의 idx 컬럼에 검색된 값을 dto idx 변수에 저장
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
			}else {
				System.out.println("검색된 결과가 없습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		return dto;
	}
	
	public ScoreDTO setTotal() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT SUM(kor) as tkor, SUM(eng) as teng, SUM(mat) as tmat "
				+ "FROM score";
		
		ScoreDTO dto = null;
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new ScoreDTO();
				
				dto.setTkor(rs.getInt("tkor"));
				dto.setTeng(rs.getInt("teng"));
				dto.setTmat(rs.getInt("tmat"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public ScoreDTO setAverage() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT AVG(kor) as akor, AVG(eng) as aeng, AVG(mat) as amat "
				+ "FROM score";
		
		ScoreDTO dto = null;
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new ScoreDTO();
				
				dto.setAkor(rs.getInt("akor"));
				dto.setAeng(rs.getInt("aeng"));
				dto.setAmat(rs.getInt("amat"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void getUpdate(ScoreDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE score SET kor = ?, eng = ?, mat = ? WHERE idx = ?";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setInt(4, dto.getIdx());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		
	}
	
	public void getDelete(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM score WHERE idx = ?";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		
	}
	
}
