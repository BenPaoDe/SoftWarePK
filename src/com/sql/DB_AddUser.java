package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_AddUser extends DBserver {
	
	static String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName = pro";
	
	public static void main(String[] args) {
		DB_AddUser addUser = new DB_AddUser();
		/*addUser.Add("tang","123");*/
	}
	public int Add(String NewName,String NewPassword){
		int check = 0;
		//int n = 0;
		try{
			String DBuser = "happy";
			String DBpassword = "281405";
			String Name = null;
			Connection con = DriverManager.getConnection(connectDB,DBuser,DBpassword);
			System.out.println("���ӳɹ�");
			Statement stmt = con.createStatement();
			System.out.println("��ѯ");
			System.out.println("��ʼ��ȡ����");
			//ResultSet rs = stmt.executeQuery("SELECT * FROM �û�  where UserName =" + NewName);		
			ResultSet rs = stmt.executeQuery("SELECT * FROM �û���Ϣ  where UserName like '%[a-z]%'");	
			while(rs.next()){
				Name = rs.getString("UserName");
				System.out.println(NewName);
				System.out.println(Name);
				System.out.println();
				System.out.println(rs.getString("UserName"));
				System.out.println();
				if(Name.equals(NewName)){
					check = 1;//�Ѵ��ڴ��û���
					break;
				}
				
				}
				if(check != 1){
					PreparedStatement pstmt=con.prepareStatement("insert into �û���Ϣ  values(?,?)");
					 pstmt.setString(1, NewName);
					 pstmt.setString(2, NewPassword);
					 pstmt.executeUpdate();
					
				}	
				/*else if(check == 1){
					PreparedStatement pstmt=con.prepareStatement("insert into �û���Ϣ  values(?,?)");
					 pstmt.setString(1, NewName);
					 pstmt.setString(2, NewPassword);
					 pstmt.executeUpdate();
					
				}*/
//			if(userpassword.equals(upassword)){
//				check = 1;
//			}
//			else{
//				check = 3;//�������
//			}
			stmt.close();
			con.close();
		}catch(SQLException e){
				e.printStackTrace();
				System.exit(0);
			}
		return check;
	}

}
