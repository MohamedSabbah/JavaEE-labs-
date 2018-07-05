package abcCom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class Myconnection {
	
	public static Connection getConnection() throws SQLException {
		String userName = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/company";
		
		DriverManager.registerDriver(new Driver());
		Connection conn = DriverManager.getConnection(url, userName, password);
		conn.setAutoCommit(false);
		return conn;

	}
}