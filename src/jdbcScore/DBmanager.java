package jdbcScore;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBmanager { //DB연결 클래스
	
	public static Connection getInstance() {
		Connection conn = null; //db연결정보 저장 객체
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "jsl28";
		String pw = "1234";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
