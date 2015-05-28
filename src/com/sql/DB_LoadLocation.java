package com.sql;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DB_LoadLocation extends DBserver {
	
	static String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName = pro";
	
	public int getLocation(String Des,String Start){
		int i = 0;
		int check = 0;
		String location = new String();
		/*System.out.println(name);*/
		
		try{
			String DBuser = "happy";
			String DBpassword = "281405";
			Connection con = DriverManager.getConnection(connectDB,DBuser,DBpassword);
			System.out.println("连接成功");
			Statement stmt = con.createStatement();
			System.out.println("查询");
			System.out.println("开始读取数据");
			ResultSet rs = stmt.executeQuery("SELECT * FROM 节点   where Location is not null");
			while(rs.next()){
				System.out.println(rs.getString("Location"));
				if(rs.getString("Location") == Des ){
					check = 0;//终点已存在
				}
				else if(rs.getString("Location") == Start){
					check = 1;//起点已存在
				}
				else if(rs.getString("Location") != Des && rs.getString("Location") != Start){
					check = 2;//两个节点都不存在
				}
				else if(rs.getString("Location") != Des){
					check = 3;	//终点不存在
				}
				else if(rs.getString("Location") != Start){
					check = 4;	//起点不存在
					}
				i++;
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
