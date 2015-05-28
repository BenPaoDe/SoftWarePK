package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.Spring;

public class DB_User extends DBserver{
	
	static String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName = pro";
	
//	public void getConnection(){
//		try{
//			Class.forName(JDriver);
//		}catch(ClassNotFoundException e){
//			System.out.println("加载数据库失败");
//			System.exit(0);
//		}
//		System.out.println("数据库连接成功");
//	}	
	
	public int getUser(String name ,String upassword){
		int check = 0;
		String userpassword = null;
		String rename = null;
		
		try{
			String DBuser = "happy";
			String DBpassword = "281405";
			Connection con = DriverManager.getConnection(connectDB,DBuser,DBpassword);
			System.out.println("连接成功");
			Statement stmt = con.createStatement();
			System.out.println("查询");
			System.out.println("开始读取数据");
			ResultSet rs = stmt.executeQuery("SELECT * FROM 用户信息  where UserName like '%[a-z]%'");
			while(rs.next()){	
				System.out.println(rs.getString("UserName"));
				if(rs.getString("UserName").equals(name)){
					rename = rs.getString("UserName");
					System.out.println(rename);
					System.out.println(name);
					userpassword = rs.getString("password");
					System.out.println(userpassword);
					if(userpassword.equals(upassword)){
				    check = 1;
			         }
			          else{
				        check = 3;//密码错误
		        	}
				}
			}
			
			stmt.close();
			con.close();
		}catch(SQLException e){
				e.printStackTrace();
				System.exit(0);
			}
		return check;
	}

}
