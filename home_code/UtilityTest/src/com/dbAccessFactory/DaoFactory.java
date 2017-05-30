package com.dbAccessFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
	//public static final String DB_NAME = "MySql";
	public static final int DB_NAME = 1;
    //public static final String DB_NAME = "Oracle";
	public static final String DB_DRIVER =  "";
	public static final String DB_URL =  "";
	public static final String DB_USER =  "root";
	public static final String DB_PASS =  "372860";
	
	private static Connection conn = null;
	static {
	    try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public static IUser createUser(){
		IUser result = null;
		switch (DB_NAME) {
			case 1:
				result = new MySqlUserDAO();
	;			break;  
	        case 2:
	        	result = new OracleUserDAO();
				break;
			default:
				break;
		}
		
		return result;
	}
	
	public static Connection getConnection() {
		
		return conn;
	}
}
