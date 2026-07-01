package jdbc;

import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		
//		DBmanager db = new DBmanager();
//		Connection conn = db.getInstance();
		Connection conn = DBmanager.getInstance();
		
		if(conn != null) {
			System.out.println("연결완료");
		}else {
			System.out.println("접속해라");
		}

	}

}
