package com.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_AddLocation {
	static String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName = pro";
	
	public void AddLocation() throws Exception{
		
		try{
			String Path="E:\\Place.txt";
			File file = new File(Path);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuffer line = new StringBuffer();
			String str = null;
			String[] Location = new String [9999];
			int i = 0;
			String DBuser = "happy";
			String DBpassword = "281405";
			Connection con = DriverManager.getConnection(connectDB,DBuser,DBpassword);
			System.out.println("���ӳɹ�");
			Statement stmt = con.createStatement();
			System.out.println("��ѯ");
			System.out.println("��ʼ��ȡ����");
			ResultSet rs = stmt.executeQuery("SELECT * FROM �ڵ�  ");
			while((str = br.readLine())!= null){
				line.append(str);
				line.append("\n");
				String[] info = str.split("%");
				System.out.println(info[0]);
				Location[i] = info[0];
				PreparedStatement pstmt=con.prepareStatement("insert into �ڵ�  values(?)");
				 pstmt.setString(1, Location[i]);
				 pstmt.executeUpdate();
				 i++;
			}
//			if(rs.getString("password") != null && rs.getString("password").equals(upassword)){
//				check = true ;
//			}
//			else{
//				
//			}
			/*while(rs.next()){
				System.out.println(rs.getString("Start"));
				System.out.println(rs.getString("Destination"));
				System.out.println(rs.getString("Distance"));*/
				/*if(rs.getString("UserName").equals(name)){
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
					break;
				}*/
				
				/*if(rs.getString("UserName").equals(name) == false){
					check = 0;
				}*/
			
			stmt.close();
			con.close();
		}catch(SQLException e){
				e.printStackTrace();
				System.exit(0);
			};
	}
}