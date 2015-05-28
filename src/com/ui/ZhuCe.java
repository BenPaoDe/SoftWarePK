package com.ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.sql.DB_AddUser;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ZhuCe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZhuCe frame = new ZhuCe();
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
	public ZhuCe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(0, 0, 517, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("  Happy\u5A01\u6D77\u9009\u8DEF\u8F6F\u4EF6");
		label.setFont(new Font("Dialog", Font.BOLD, 25));
		label.setBounds(130, 23, 264, 97);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(130, 145, 264, 165);
		panel.add(panel_1);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB_AddUser add = new DB_AddUser();
				String newusername = null;
				String newpassword = null;
				String renewpassword = null;
				newusername = textField.getText();
				newpassword = textField_1.getText();
				renewpassword = textField_2.getText();
				if(newpassword.equals(renewpassword)){
					if(add.Add(newusername, newpassword) == 1){
				ChengGong cg = new ChengGong();
				cg.run();
				HappyWeiHai hwh = new HappyWeiHai();
				hwh.run();
					}
			}
			}
		});
		button.setBounds(34, 125, 90, 30);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(146, 125, 90, 30);
		panel_1.add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(87, 20, 136, 21);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 48, 136, 21);
		panel_1.add(textField_1);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_1.setBounds(23, 23, 54, 15);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setBounds(34, 51, 54, 15);
		panel_1.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 79, 136, 21);
		panel_1.add(textField_2);
		
		JLabel label_3 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label_3.setBounds(14, 80, 74, 18);
		panel_1.add(label_3);
	}
	
	public void run() {
		try {
			ZhuCe frame = new ZhuCe();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
