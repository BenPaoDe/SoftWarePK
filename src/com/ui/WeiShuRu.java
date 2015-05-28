package com.ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WeiShuRu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeiShuRu frame = new WeiShuRu();
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
	public WeiShuRu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u672A\u8F93\u5165\u6B63\u786E\u4FE1\u606F");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		label.setBounds(66, 27, 110, 23);
		contentPane.add(label);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(72, 76, 93, 23);
		contentPane.add(button);
	}
	
	public void run() {
		try {
			WeiShuRu frame = new WeiShuRu();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
