package com.sql;

import java.sql.*;
import java.util.Collection;

public class DBserver {
	
	static String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName = pro";
		
	public static void main(String[] args){
	}
	
	public void getConnection(){
		try{
			Class.forName(JDriver);
		}catch(ClassNotFoundException e){
			System.out.println("加载数据库失败");
			System.exit(0);
		}
		System.out.println("数据库连接成功");
	}	
}

