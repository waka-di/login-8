package com.diworksdev.login.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/logindb_wakasa";
	
	private static String user = "root";
	private static String password = "disql";
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(driverName);  //最近は書かない事が多い
			con = (Connection) DriverManager.getConnection(url,user,password); //MySQLに接続するため
		} 
		catch(ClassNotFoundException e ){
			e.printStackTrace();
		} 
		catch(SQLException e) { 
			e.printStackTrace();
		}
		return con;
	}
}
