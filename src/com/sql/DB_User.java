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
//			System.out.println("�������ݿ�ʧ��");
//			System.exit(0);
//		}
//		System.out.println("���ݿ����ӳɹ�");
//	}	
	
	public int getUser(String name ,String upassword){
		int check = 0;
		String userpassword = null;
		String rename = null;
		
		try{
			String DBuser = "happy";
			String DBpassword = "281405";
			Connection con = DriverManager.getConnection(connectDB,DBuser,DBpassword);
			System.out.println("���ӳɹ�");
			Statement stmt = con.createStatement();
			System.out.println("��ѯ");
			System.out.println("��ʼ��ȡ����");
			ResultSet rs = stmt.executeQuery("SELECT * FROM �û���Ϣ  where UserName like '%[a-z]%'");
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
				        check = 3;//�������
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
