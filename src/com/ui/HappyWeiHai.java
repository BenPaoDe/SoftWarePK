package com.ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JMenuBar;

import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.List;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

import com.sql.DB_AddLocation;
import com.sql.DB_AddRoad;
import com.sql.DB_User;
import com.sql.DBserver;



public class HappyWeiHai extends JFrame  {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private Image image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HappyWeiHai frame = new HappyWeiHai();
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
	public HappyWeiHai() {
		Graphics g;
		
		image = Toolkit.getDefaultToolkit().getImage( "F:\\my\\HappyWeiHai\\2011903111950783.jpg"); ;
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\my\\HappyWeiHai\\20141229022446668_easyicon_net_128.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("sad");
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(0, 0, 517, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(120, 176, 264, 165);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final DB_User db = new DB_User();
				final DB_AddRoad ar = new DB_AddRoad();
				final DB_AddLocation al = new DB_AddLocation();
				int check = 0;
				String username = textField_2.getText();
				String password = textField_3.getText();
				db.getConnection();
				
				System.out.println(username);
				System.out.println(password);
				
				try {
						ar.AddRoad();
						al.AddLocation();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				check = db.getUser(username,password);
				if(check == 1){
					
					XuanLu xl = new XuanLu();
					xl.run();
					dispose();
				}
				else if(check == 0){
					WuYongHu wyh = new WuYongHu();
					wyh.run();
				}
				else if(check == 3){
					MiMaCuoWu mmcw = new MiMaCuoWu();
					mmcw.run();
				}
				
			}
		});
		btnNewButton.setBounds(34, 125, 90, 30);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZhuCe zc = new ZhuCe();
				zc.run();
				dispose();
			}
		});
		btnNewButton_1.setBounds(146, 125, 90, 30);
		panel_2.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(87, 20, 136, 21);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(87, 64, 136, 21);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setBounds(34, 23, 54, 15);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setBounds(46, 67, 54, 15);
		panel_2.add(label_1);
		
		JLabel lblNewLabel = new JLabel("  Happy\u5A01\u6D77\u9009\u8DEF\u8F6F\u4EF6");
		lblNewLabel.setBounds(120, 23, 264, 97);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new   java.awt.Font("Dialog",   1,   25));  
	}
	
	public void run() {
		try {
			HappyWeiHai frame = new HappyWeiHai();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
