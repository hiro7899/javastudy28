package jdbc.artist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	public List<EmpDTO> empPrint() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = """
				SELECT emp_name, dept_name
				FROM emp
				LEFT JOIN dept ON emp.dept_no = dept.dept_no
				""";
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO emp = new EmpDTO();
				
				emp.setEmpName(rs.getString("emp_name"));
				emp.setDeptName(rs.getString("dept_name"));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanager.close(rs, pstmt, conn);
		}
		
		return list;
	}
	
}
