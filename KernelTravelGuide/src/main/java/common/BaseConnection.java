package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseConnection {
	protected static Connection conn;

	protected Connection getConnection() {
		try {
			String dbURL = "jdbc:sqlserver://127.0.0.1:1434;" + "databaseName=TravelGuide;"
					+ "encrypt=true;trustServerCertificate=true;";
			String userName = "sa";
			String password = "123456";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(dbURL, userName, password);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}

	protected void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
