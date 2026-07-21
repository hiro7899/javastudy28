package jdbc.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	//화면 입력
	public void viewInsert() {
//		System.out.print("학번 : ");
//		int idx = countIdx();
		
		System.out.print("이름 : ");
		String name = scanner.next();
				
		System.out.print("국어 : ");
		int kor = scanner.nextInt();
				
		System.out.print("영어 : ");
		int eng = scanner.nextInt();
				
		System.out.print("수학 : ");
		int mat = scanner.nextInt();
		
		ScoreDTO dto = new ScoreDTO();
		
		dto.setIdx(countIdx());
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMat(mat);
		
		setInsert(dto);
	}
	
	public void findByIdx() {
		System.out.print("학번 입력: ");
		int idx = scanner.nextInt();
		
		ScoreDTO dto = getCondition(idx);
		
		System.out.print(dto.getIdx()+ " " + dto.getName() + " " 
				+ dto.getKor() + " " + dto.getEng() + " " + dto.getMat());
		
		int tot = dto.getKor() + dto.getEng() + dto.getMat();
		double ave = (double)tot / 3;
		
		System.out.print(" 총점 : " + tot + " ");
		System.out.println("평균 : " + ave);
	}
	
	public void printAll() {
		System.out.println("전체 인원수 : " + getCount());
		System.out.println("========전체출력=========");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		
		List<ScoreDTO> list = getScore();
        for(ScoreDTO dto : list) {
        	int tot = dto.getKor() + dto.getEng() + dto.getMat();
        	double ave = (double)tot / 3;
        	ave = Math.round(ave * 100)/100.0; 
        	String grade = "";
        	
        	if(ave >= 90) {
        		grade = "A";
        	} else if(ave >= 80) {
        		grade = "B";
        	} else if(ave >= 70) {
        		grade = "C";
        	} else if(ave >= 60) {
        		grade = "D";
        	} else {
        		grade = "F";
        	}
        	
        	System.out.println(dto + "\t" + tot + "\t" + ave + "\t" + grade);
        }
        System.out.println("=======================");
        ScoreDTO dto = null;
        dto = setTotal();
        System.out.println("전체총점 : "+dto.getTkor()+", "+dto.getTeng()+", "+dto.getTmat());
        dto = setAverage();
        System.out.println("전체평균 : "+dto.getAkor()+", "+dto.getAeng()+", "+dto.getAmat());
	}
	
	public void printMaxIdxName() {
		List<ScoreDTO> list = getMaxKor();
		for(ScoreDTO dto : list) {
			System.out.println(dto.getIdx() + ", ");
			System.out.println(dto.getName());
		}
	}
	
	public void printTotAvg() {
		System.out.println("전체 인원수 : " + getCount());
		System.out.println("========전체출력=========");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		DecimalFormat df = new DecimalFormat("#.00");
		List<ScoreDTO> list = getOracle();
		
		for(ScoreDTO dto : list) {
			System.out.println(dto + "\t" + dto.getTot() + "\t" + df.format(dto.getAve()) + "\t" + dto.getGrade());
		}
	}
	
	public void updateView() {
		System.out.print("수정할 학번 입력: ");
	    int idx = scanner.nextInt();
	    
	    ScoreDTO dto = getCondition(idx);
	    
	    if(dto == null) {
	        System.out.println("존재하지 않는 학번입니다.");
	        return;
	    }
	    System.out.println(dto);
	    
	    System.out.print("[1]이름 [2]국어 [3]영어 [4]수학 : ");
	    int subMenu = scanner.nextInt();
	    
	    if(subMenu == 1) {
	        System.out.print("새 이름: ");
	        dto.setName(scanner.next());
	    } else if(subMenu == 2) {
	        System.out.print("새 국어점수: ");
	        dto.setKor(scanner.nextInt()); 
	    } else if(subMenu == 3) {
	        System.out.print("새 영어 점수: ");
	        dto.setKor(scanner.nextInt()); 
	    } else if(subMenu == 4) {
	        System.out.print("새 수학 점수: ");
	        dto.setKor(scanner.nextInt()); 
	    } else {
			System.out.println("잘못 된 입력");
			return;
		}
	    
	    getUpdate(dto);
	    System.out.println("수정 완료!");

	}
	
	public void deleteView() {
		System.out.print("삭제하실 학번 : ");
		int idx = scanner.nextInt();
		ScoreDTO dto = getCondition(idx);
	    
	    if(dto == null) {
	        System.out.println("존재하지 않는 학번입니다.");
	        return;
	    }
	    
		getDelete(idx);
		
		System.out.println(idx + "번 삭제 성공!");
	}
	
	public boolean setInsert(ScoreDTO dto) {
		Connection conn = null; //db접속 정보 저장 객체 
		PreparedStatement pstmt = null; //sql
		boolean flag = false;
		String sql = "INSERT INTO score (idx, name, kor, eng, mat) VALUES (?, ?, ?, ?, ?)";
		
		try {
			conn = DBmanager.getInstance(); //db접속
			
			pstmt = conn.prepareStatement(sql); //sql 문을 실행하기 위한 준비
			
			pstmt.setInt(1, dto.getIdx()); //1번 ? 에 idx 값을 가져와서 int 형을 set 시켜라
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			
			int result = pstmt.executeUpdate(); //sql 실행	
			if(result > 0) {
				flag = true;
			}
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("이미 존재하는 학번입니다.");
		} finally {
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		return flag;
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
	
	public boolean getUpdate(ScoreDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean flag = false;
		
		String sql = "UPDATE score SET kor = ?, eng = ?, mat = ? WHERE idx = ?";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setInt(4, dto.getIdx());
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				flag = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		return flag;
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
