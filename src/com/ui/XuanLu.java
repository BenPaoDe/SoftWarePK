package com.ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.sql.DB_AddLocation;
import com.sql.DB_LoadLocation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;


public class XuanLu extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XuanLu frame = new XuanLu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public XuanLu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(0, 0, 514, 352);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u6DFB\u52A0\u51FA\u53D1\u5730\uFF1A");
		label.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		label.setBounds(27, 47, 84, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u6DFB\u52A0\u76EE\u7684\u5730\uFF1A");
		label_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		label_1.setBounds(27, 83, 84, 25);
		panel.add(label_1);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB_AddLocation al = new DB_AddLocation();
				String des = null;
				String start = null;
				String distance = null;
				int check = 0;
				des = textField_1.getText();
				start = textField_2.getText();
				distance = textField_3.getText();
				DB_LoadLocation ll = new DB_LoadLocation();
				check = ll.getLocation(des, start);
				if(check == 2){//∆µ„∫Õ÷’µ„∂º√ª”–
					try {
			            FileOutputStream f=new FileOutputStream("E:/Place.txt",true);
			            f.write("’‚ «∏ˆ≤‚ ‘".getBytes());
			            f.write("\r\n".getBytes("utf-8"));
			            f.write(des.getBytes("utf-8"));
			            f.write("\r\n".getBytes("utf-8"));
			            f.write(start.getBytes("utf-8"));
			            /*f.write("\r\n".getBytes("utf-8"));*/
			            f.close();
			            System.out.println("¿≤¿≤¿≤");
			        } catch (Exception e1) {
			            // TODO Auto-generated catch block
			            e1.printStackTrace();
			        }
				}
				else if(check == 3){
					try {
			            FileOutputStream f=new FileOutputStream("E:/Place.txt",true);
			            f.write("\r\n".getBytes("utf-8"));
			            f.write(des.getBytes());
			            f.write("\r\n".getBytes("utf-8"));
			            f.close();
			            System.out.println("∫Ÿ∫Ÿ");
			        } catch (Exception e1) {
			            // TODO Auto-generated catch block
			            e1.printStackTrace();
			        }
				}
				else if(check == 4){
					try {
			            FileOutputStream f=new FileOutputStream("E:/Place.txt",true);
			            f.write("\r\n".getBytes("utf-8"));
			            f.write(start.getBytes("utf-8"));
			            f.write("\r\n".getBytes("utf-8"));
			            f.close();
			            System.out.println("biubiu");
			        } catch (Exception e1) {
			            // TODO Auto-generated catch block
			            e1.printStackTrace();
			        }
					
				}
				try {
					al.AddLocation();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
		            FileOutputStream f=new FileOutputStream("E:/Distance.txt",true);
		            f.write("\r\n".getBytes("utf-8"));
		            f.write(des.getBytes("utf-8"));
		            f.write("%".getBytes("utf-8"));
		            f.write(start.getBytes("utf-8"));
		            f.write("%".getBytes("utf-8"));
		            f.write(distance.getBytes("utf-8"));
		            f.close();
		            System.out.println("≈„≈„");
		        } catch (Exception e1) {
		            // TODO Auto-generated catch block
		            e1.printStackTrace();
		        }
				}
			
		});
		button.setBounds(347, 49, 93, 23);
		panel.add(button);
		
		JButton btnNewButton = new JButton("ÕÀ≥ˆ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnNewButton.setBounds(347, 84, 93, 25);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 50, 120, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 86, 120, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6DFB\u52A0\u8DDD\u79BB\uFF1A");
		label_2.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		label_2.setBounds(27, 121, 84, 15);
		panel.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 119, 120, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
	}
	
	public void run() {
		try {
			XuanLu frame = new XuanLu();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
