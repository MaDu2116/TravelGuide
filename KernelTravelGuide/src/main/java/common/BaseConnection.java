package common;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseConnection {
		 private static String DB_URL = "jdbc:sqlserver://127.0.0.1:1434;"
		            + "databaseName=TravelGuide;"
		            + "encrypt=true;trustServerCertificate=true;";
		    private static String USER_NAME = "sa";
		    private static String PASSWORD = "123456";
		    
	    public static void main(String[] args) throws ClassNotFoundException {
	 
	        Connection conn = null;
	 
	        try {
	        	conn = getConnection(DB_URL, USER_NAME, PASSWORD);
	        	 if (conn != null) {
	                 DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                 System.out.println("Driver name: " + dm.getDriverName());
	                 System.out.println("Driver version: " + dm.getDriverVersion());
	                 System.out.println("Product name: " + dm.getDatabaseProductName());
	                 System.out.println("Product version: " + dm.getDatabaseProductVersion());
	             }
	        	conn.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	    }
	    public static Connection getConnection(String dbURL, String userName, 
	            String password) {
	        Connection conn = null;
	        try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            conn = DriverManager.getConnection(dbURL, userName, password);
	            System.out.println("connect successfully!");
	        } catch (Exception ex) {
	            System.out.println("connect failure!");
	            ex.printStackTrace();
	        }
	        return conn;
	}

}
