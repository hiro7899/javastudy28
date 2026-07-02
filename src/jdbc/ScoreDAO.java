package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			e.printStackTrace();
		} finally {
			if (pstmt != null) try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
	        if (conn != null) try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
		}
		
	}
	
	
	//전체 검색
	public void getScore() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	}
	
	//조건 검색
	public void getCondition() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
	}
	
	public void getUpdate() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	}
	
	public void getDelete() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	}
	
}
