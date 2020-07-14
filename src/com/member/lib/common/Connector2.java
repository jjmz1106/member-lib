package com.member.lib.common;

import java.sql.Connection;

public class Connector2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1522/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	static{
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection open() {
		
	}
		
	

}
