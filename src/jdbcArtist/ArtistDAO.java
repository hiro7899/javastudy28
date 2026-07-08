package jdbcArtist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtistDAO {

	public void add(ArtistDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = """
				INSERT INTO tbl_artist (
					artist_id, artist_name, artist_gender, artist_birth, talent, agency
				) 
				VALUES (?, ?, ?, ?, ?, ?)
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getArtistId());
			pstmt.setString(2, dto.getArtistName());
			pstmt.setString(3, dto.getArtistGender());
			pstmt.setString(4, dto.getArtistBirth());
			pstmt.setString(5, dto.getTalent());
			pstmt.setString(6, dto.getAgency());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBmanager.close(pstmt, conn);
		}
	}
	
	public List<ArtistDTO> select(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<ArtistDTO> list = new ArrayList<ArtistDTO>();
		
		String sql = """
				SELECT * FROM tbl_artist
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				
				dto.setArtistId(rs.getString("artist_id"));
				dto.setArtistName(rs.getString("artist_name"));
				dto.setArtistGender(rs.getString("artist_gender"));
				dto.setArtistBirth(rs.getString("artist_birth"));
				dto.setTalent(rs.getString("talent"));
				dto.setAgency(rs.getString("agency"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(rs, pstmt, conn);
		}
				
		return list;
	}
	
	public ArtistDTO selectOne() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArtistDTO dto = null;

		String sql = """
				SELECT * FROM tbl_artist 
				WHERE artist_id = ?
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new ArtistDTO();
				
				dto.setArtistId(rs.getString("artist_id"));
				dto.setArtistName(rs.getString("artist_name"));
				dto.setArtistGender(rs.getString("artist_gender"));
				dto.setArtistBirth(rs.getString("artist_birth"));
				dto.setTalent(rs.getString("talent"));
				dto.setAgency(rs.getString("agency"));
			}else {
				System.out.println("번호가 존재하지 않습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(rs, pstmt, conn);
		}
		return dto;
	}
	
	public void update(ArtistDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = """
				UPDATE tbl_artist 
				SET artist_name = ?, artist_gender = ?, artist_birth = ?, talent = ?, agency = ? 
				WHERE artist_id = ?
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getArtistName());
			pstmt.setString(2, dto.getArtistGender());
			pstmt.setString(3, dto.getArtistBirth());
			pstmt.setString(4, dto.getTalent());
			pstmt.setString(5, dto.getAgency());
			pstmt.setString(6, dto.getArtistId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(pstmt, conn);
		}
	}
	
	public void delete(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = """
				DELETE FROM tbl_artist 
				WHERE artist_id = ?
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(pstmt, conn);
		}
	}
	
}
