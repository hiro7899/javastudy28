package jdbc.oil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OilDAO {

	public List<OilDTO> selectOilSale(){
		List<OilDTO> list = new ArrayList<OilDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = """
				SELECT s.saleno, s.oildate, o.oilname, s.amount, s.paytype, c.custname,
				    s.custno, c.custtel1, c.custtel2, c.custtel3, s.creditcard, s.oilcost
				FROM tbl_saleinfo s
				JOIN tbl_oilinfo o ON s.oiltype = o.oiltype
				LEFT JOIN tbl_custinfo c ON s.custno = c.custno
				ORDER BY s.saleno
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OilDTO dto = new OilDTO();
				
				dto.setSaleno(rs.getString("saleno"));
				dto.setOildate(rs.getString("oildate"));
				dto.setOilname(rs.getString("oilname"));
				dto.setAmount(rs.getInt("amount"));
				dto.setPaytype(rs.getString("paytype"));
				dto.setCustname(rs.getString("custname"));
				dto.setCustno(rs.getString("custno"));
				dto.setCusttel1(rs.getString("custtel1"));
				dto.setCusttel2(rs.getString("custtel2"));
				dto.setCusttel3(rs.getString("custtel3"));
				dto.setCreditcard(rs.getString("creditcard"));
				dto.setOilcost(rs.getInt("oilcost"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(rs, pstmt, conn);
		}
		
		return list;
	}
	
	public List<OilDTO> selectDayTotal(){
		List<OilDTO> list = new ArrayList<OilDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = """
				SELECT s.oildate, o.oilname, COUNT(s.saleno) AS count, SUM(s.oilcost) AS tcost
				FROM tbl_saleinfo s
				JOIN tbl_oilinfo o ON s.oiltype = o.oiltype 
				GROUP BY s.oildate, o.oilname
				ORDER BY s.oildate
				""";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OilDTO dto = new OilDTO();
				
				dto.setOildate(rs.getString("oildate"));
				dto.setOilname(rs.getString("oilname"));
				dto.setCount(rs.getInt("count"));
				dto.setTcost(rs.getInt("tcost"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(rs, pstmt, conn);
		}
		
		return list;
	}
	
}
