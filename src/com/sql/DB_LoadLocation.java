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
			System.out.println("���ӳɹ�");
			Statement stmt = con.createStatement();
			System.out.println("��ѯ");
			System.out.println("��ʼ��ȡ����");
			ResultSet rs = stmt.executeQuery("SELECT * FROM �ڵ�   where Location is not null");
			while(rs.next()){
				System.out.println(rs.getString("Location"));
				if(rs.getString("Location") == Des ){
					check = 0;//�յ��Ѵ���
				}
				else if(rs.getString("Location") == Start){
					check = 1;//����Ѵ���
				}
				else if(rs.getString("Location") != Des && rs.getString("Location") != Start){
					check = 2;//�����ڵ㶼������
				}
				else if(rs.getString("Location") != Des){
					check = 3;	//�յ㲻����
				}
				else if(rs.getString("Location") != Start){
					check = 4;	//��㲻����
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
