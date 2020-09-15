/*
 * @name        Simple Calculator
 * @package     calculator
 * @file        Calculator.java
 * @author      Tống Hoàng Hải
 * @email       haivip18620@gmail.com
 * @github      https://github.com/BOT-MEO
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.*;
import java.util.regex.Pattern;
import java.math.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import jdk.jfr.Enabled;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.math.*;
import javax.swing.JEditorPane;
import java.awt.List;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JMenuItem length;
	private JMenuItem standard;
	private JMenuItem temperature;
	private JTextField standard_hienthi;
	private JTextField standard_ketqua;
	private JTextField length_hienthi;
	private JTextField length_ketqua;
	private JTextField temperature_hienthi;
	private JTextField temperature_ketqua;
	private JComboBox length_donvi_1;
	private JComboBox length_donvi_2;
	private JComboBox temperature_donvi_1;
	private JComboBox temperature_donvi_2;
	double firstnumbers;
	double secondnumbers;
	String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Calculator");
					frame.setSize(355, 566);
					frame.length_hienthi.setVisible(false);
					frame.length_ketqua.setVisible(false);
					frame.length_donvi_1.setVisible(false);
					frame.length_donvi_2.setVisible(false);
					frame.temperature_hienthi.setVisible(false);
					frame.temperature_ketqua.setVisible(false);
					frame.temperature_donvi_1.setVisible(false);
					frame.temperature_donvi_2.setVisible(false);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\git\\repository\\Calculator\\src\\calculator\\Icon\\Apps-Calculator-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 565 );
		contentPane = new JPanel();
		contentPane.setBackground(new Color(247, 97, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//---------Hiển thị---------   
		standard_hienthi = new JTextField();
		standard_hienthi.setEditable(false);
		standard_hienthi.setBorder(null);
		standard_hienthi.setBackground(new Color(247, 97, 87));
		standard_hienthi.setHorizontalAlignment(SwingConstants.TRAILING);
		standard_hienthi.setFont(new Font("Calibri", Font.BOLD, 25));
		standard_hienthi.setForeground(Color.WHITE);
		standard_hienthi.setBounds(5, 70, 329, 60);
		contentPane.add(standard_hienthi);
		standard_hienthi.setColumns(10);
					
		standard_ketqua = new JTextField();
		standard_ketqua.setBorder(null);
		standard_ketqua.setBackground(new Color(247, 97, 87));
		standard_ketqua.setHorizontalAlignment(SwingConstants.TRAILING);
		standard_ketqua.setEditable(false);
		standard_ketqua.setFont(new Font("Calibri", Font.BOLD, 25));
		standard_ketqua.setForeground(Color.WHITE);
		standard_ketqua.setColumns(10);
		standard_ketqua.setBounds(5, 132, 329, 60);
		contentPane.add(standard_ketqua);
			
		length_hienthi = new JTextField();
		length_hienthi.setFont(new Font("Calibri", Font.BOLD, 20));
		length_hienthi.setHorizontalAlignment(SwingConstants.TRAILING);
		length_hienthi.setColumns(10);
		length_hienthi.setEditable(false);
		length_hienthi.setBorder(null);
		length_hienthi.setBackground(new Color(247, 97, 87));
		length_hienthi.setForeground(Color.WHITE);
		length_hienthi.setBounds(5, 39, 329, 50);
		contentPane.add(length_hienthi);
			
	    length_ketqua = new JTextField();
		length_ketqua.setFont(new Font("Calibri", Font.BOLD, 20));
		length_ketqua.setHorizontalAlignment(SwingConstants.TRAILING);
		length_ketqua.setColumns(10);
		length_ketqua.setEditable(false);
		length_ketqua.setBorder(null);
		length_ketqua.setBackground(new Color(247, 97, 87));
		length_ketqua.setForeground(Color.WHITE);
		length_ketqua.setBounds(5, 124, 329, 50);
		contentPane.add(length_ketqua);
		
		temperature_hienthi = new JTextField();
		temperature_hienthi.setFont(new Font("Calibri", Font.BOLD, 20));
		temperature_hienthi.setHorizontalAlignment(SwingConstants.TRAILING);
		temperature_hienthi.setColumns(10);
		temperature_hienthi.setEditable(false);
		temperature_hienthi.setBorder(null);
		temperature_hienthi.setBackground(new Color(247, 97, 87));
		temperature_hienthi.setForeground(Color.WHITE);
		temperature_hienthi.setBounds(5, 39, 329, 50);
		contentPane.add(temperature_hienthi);
			
		temperature_ketqua = new JTextField();
		temperature_ketqua.setFont(new Font("Calibri", Font.BOLD, 20));
		temperature_ketqua.setHorizontalAlignment(SwingConstants.TRAILING);
		temperature_ketqua.setColumns(10);
		temperature_ketqua.setEditable(false);
		temperature_ketqua.setBorder(null);
		temperature_ketqua.setBackground(new Color(247, 97, 87));
		temperature_ketqua.setForeground(Color.WHITE);
		temperature_ketqua.setBounds(5, 124, 329, 50);
		contentPane.add(temperature_ketqua);
		
		
		
		//---------Menu---------
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(247, 97, 87));
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 339, 35);
		contentPane.add(menuBar);
				
		JMenu mnNewMenu = new JMenu("File\r\n");
		mnNewMenu.setFocusPainted(false);
		mnNewMenu.setBorderPainted(false);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		mnNewMenu.setForeground(Color.WHITE);
		menuBar.add(mnNewMenu);
				
		standard = new JMenuItem("Standard");
		standard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {		
					standard_hienthi.setVisible(true);
					standard_ketqua.setVisible(true);
					length_hienthi.setVisible(false);	
					length_ketqua.setVisible(false);
					length_donvi_1.setVisible(false);
					length_donvi_2.setVisible(false);
					temperature_hienthi.setVisible(false);
					temperature_ketqua.setVisible(false);
					temperature_donvi_1.setVisible(false);
					temperature_donvi_2.setVisible(false);
				}
			}
		});		
		standard.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		mnNewMenu.add(standard);
				
		length = new JMenuItem("Length\r\n");
		length.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(length.isEnabled()) {
					length_hienthi.setVisible(true);
					length_ketqua.setVisible(true);
					length_donvi_1.setVisible(true);
					length_donvi_2.setVisible(true);
					standard_hienthi.setVisible(false);
					standard_ketqua.setVisible(false);
					temperature_hienthi.setVisible(false);
					temperature_ketqua.setVisible(false);
					temperature_donvi_1.setVisible(false);
					temperature_donvi_2.setVisible(false);
				}
			}
		});
		length.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		mnNewMenu.add(length);
		
		temperature = new JMenuItem("Temperature\r\n");
		temperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temperature.isEnabled()) {
					temperature_hienthi.setVisible(true);
					temperature_ketqua.setVisible(true);
					temperature_donvi_1.setVisible(true);
					temperature_donvi_2.setVisible(true);
					standard_hienthi.setVisible(false);
					standard_ketqua.setVisible(false);
					length_hienthi.setVisible(false);
					length_ketqua.setVisible(false);
					length_donvi_1.setVisible(false);
					length_donvi_2.setVisible(false);
				}		
			}
		});
		temperature.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		mnNewMenu.add(temperature);
		
		
		//---------Các button số từ 0 đến 9---------
		JButton btn_so_0 = new JButton("0\r\n");
		btn_so_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+0);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+0);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+0);
				}
			}
		});
		btn_so_0.setFocusPainted(false);
		btn_so_0.setBorder(null);
		btn_so_0.setBackground(new Color(0, 102, 204));
		btn_so_0.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_0.setForeground(new Color(255, 255, 255));
		btn_so_0.setBounds(5, 470, 163, 50);
		contentPane.add(btn_so_0);
		
		JButton btn_so_1 = new JButton("1\r\n");
		btn_so_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+1);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+1);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+1);
				}
			}
		});
		btn_so_1.setFocusPainted(false);
		btn_so_1.setBorder(null);
		btn_so_1.setBackground(new Color(0, 102, 204));
		btn_so_1.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_1.setForeground(new Color(255, 255, 255));
		btn_so_1.setBounds(5, 417, 80, 50);
		contentPane.add(btn_so_1);
		
		JButton btn_so_2 = new JButton("2\r\n");
		btn_so_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+2);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+2);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+2);
				}
			}
		});
		btn_so_2.setFocusPainted(false);
		btn_so_2.setBorder(null);
		btn_so_2.setBackground(new Color(0, 102, 204));
		btn_so_2.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_2.setForeground(new Color(255, 255, 255));
		btn_so_2.setBounds(88, 417, 80, 50);
		contentPane.add(btn_so_2);
		
		JButton btn_so_3 = new JButton("3");
		btn_so_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+3);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+3);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+3);
				}
			}
		});
		btn_so_3.setFocusPainted(false);
		btn_so_3.setBorder(null);
		btn_so_3.setBackground(new Color(0, 102, 204));
		btn_so_3.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_3.setForeground(new Color(255, 255, 255));
		btn_so_3.setBounds(171, 417, 80, 50);
		contentPane.add(btn_so_3);
		
		
		JButton btn_so_4 = new JButton("4");
		btn_so_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+4);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+4);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+4);
				}
			}
		});
		btn_so_4.setFocusPainted(false);
		btn_so_4.setBorder(null);
		btn_so_4.setBackground(new Color(0, 102, 204));
		btn_so_4.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_4.setForeground(new Color(255, 255, 255));
		btn_so_4.setBounds(5, 364, 80, 50);
		contentPane.add(btn_so_4);
		
		JButton btn_so_5 = new JButton("5\r\n");
		btn_so_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+5);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+5);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+5);
				}
			}
		});
		btn_so_5.setFocusPainted(false);
		btn_so_5.setBorder(null);
		btn_so_5.setBackground(new Color(0, 102, 204));
		btn_so_5.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_5.setForeground(new Color(255, 255, 255));
		btn_so_5.setBounds(88, 364, 80, 50);
		contentPane.add(btn_so_5);
		
		JButton btn_so_6 = new JButton("6");
		btn_so_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+6);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+6);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+6);
				}
			}
		});
		btn_so_6.setFocusPainted(false);
		btn_so_6.setBorder(null);
		btn_so_6.setBackground(new Color(0, 102, 204));
		btn_so_6.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_6.setForeground(new Color(255, 255, 255));
		btn_so_6.setBounds(171, 364, 80, 50);
		contentPane.add(btn_so_6);
		
		JButton btn_so_7 = new JButton("7");
		btn_so_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+7);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+7);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+7);
				}
			}
		});
		btn_so_7.setFocusPainted(false);
		btn_so_7.setBorder(null);
		btn_so_7.setBackground(new Color(0, 102, 204));
		btn_so_7.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_7.setForeground(new Color(255, 255, 255));
		btn_so_7.setBounds(5, 311, 80, 50);
		contentPane.add(btn_so_7);
		
		JButton btn_so_8 = new JButton("8");
		btn_so_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+8);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+8);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+8);
				}
			}
		});
		btn_so_8.setFocusPainted(false);
		btn_so_8.setBorder(null);
		btn_so_8.setBackground(new Color(0, 102, 204));
		btn_so_8.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_8.setForeground(new Color(255, 255, 255));
		btn_so_8.setBounds(88, 311, 80, 50);
		contentPane.add(btn_so_8);
		
		JButton btn_so_9 = new JButton("9");
		btn_so_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(standard_hienthi.getText()+9);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(length_hienthi.getText()+9);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(temperature_hienthi.getText()+9);
				}
			}
		});
		btn_so_9.setFocusPainted(false);
		btn_so_9.setBorder(null);
		btn_so_9.setBackground(new Color(0, 102, 204));
		btn_so_9.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_9.setForeground(new Color(255, 255, 255));
		btn_so_9.setBounds(171, 311, 80, 50);
		contentPane.add(btn_so_9);
		
		//---------Button hàm---------
		JButton btn_sothuc = new JButton(".");
		btn_sothuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					if(standard_hienthi.getText().contains(".")) {
						return;
					}
					standard_hienthi.setText(standard_hienthi.getText()+".");
				}
				if(length.isEnabled()) {
					if(length_hienthi.getText().contains(".")) {
						return;
					}
					length_hienthi.setText(length_hienthi.getText()+".");
				}
				if(temperature.isEnabled()) {
					if(temperature_hienthi.getText().contains(".")) {
						return;
					}
					temperature_hienthi.setText(temperature_hienthi.getText()+".");
				}
			}
		});
		btn_sothuc.setFocusPainted(false);
		btn_sothuc.setBorder(null);
		btn_sothuc.setBackground(new Color(0, 102, 204));
		btn_sothuc.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_sothuc.setForeground(new Color(255, 255, 255));
		btn_sothuc.setBounds(171, 470, 80, 50);
		contentPane.add(btn_sothuc);
		
		JButton btn_am = new JButton("\u00B1");
		btn_am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					double ops = Double.parseDouble(standard_hienthi.getText());
					standard_hienthi.setText(String.valueOf(ops*(-1)));
					if(standard_hienthi.getText().endsWith(".0")) {
						standard_hienthi.setText(standard_hienthi.getText().replace(".0", ""));
					}
				}
			}
		});
		btn_am.setFocusPainted(false);
		btn_am.setBorder(null);
		btn_am.setBackground(new Color(0, 102, 204));
		btn_am.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_am.setForeground(new Color(255, 255, 255));
		btn_am.setBounds(171, 258, 80, 50);
		contentPane.add(btn_am);
				
		JButton btn_canbac2 = new JButton("√");
		btn_canbac2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {   
					firstnumbers = Double.parseDouble(standard_hienthi.getText());
					operation = "sqrt";
				}
			}
		});
		btn_canbac2.setFocusPainted(false);
		btn_canbac2.setBorder(null);
		btn_canbac2.setBackground(new Color(0, 102, 204));
		btn_canbac2.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_canbac2.setForeground(new Color(255, 255, 255));
		btn_canbac2.setBounds(88, 258, 80, 50);
		contentPane.add(btn_canbac2);
		
		JButton btn_xmun = new JButton("x²\r\n");
		btn_xmun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					firstnumbers = Double.parseDouble(standard_hienthi.getText());
					standard_hienthi.setText("("+firstnumbers+")"+"²");
					standard_ketqua.setText(String.valueOf(Math.pow(firstnumbers,2)));
					if(standard_ketqua.getText().endsWith(".0")) {
						standard_ketqua.setText(standard_ketqua.getText().replace(".0", ""));
					}  
				}
			}
		});
		btn_xmun.setFocusPainted(false);
		btn_xmun.setBorder(null);
		btn_xmun.setForeground(new Color(255, 255, 255));
		btn_xmun.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_xmun.setBackground(new Color(0, 102, 204));
		btn_xmun.setBounds(5, 258, 80, 50);
		contentPane.add(btn_xmun);
		
		//---------Button tính toán---------
		JButton btn_cong = new JButton("+");
		btn_cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumbers = Double.parseDouble(standard_hienthi.getText());
				standard_hienthi.setText("");
				operation = "+";
			}
		});
		btn_cong.setFocusPainted(false);
		btn_cong.setBorder(null);
		btn_cong.setForeground(new Color(255, 255, 255));
		btn_cong.setBackground(new Color(0, 102, 204));
		btn_cong.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_cong.setBounds(254, 417, 80, 50);
		contentPane.add(btn_cong);
				
		JButton btn_tru = new JButton("\u2013");
		btn_tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumbers = Double.parseDouble(standard_hienthi.getText());
				standard_hienthi.setText("");
				operation = "-";  	
			}
		});
		btn_tru.setFocusPainted(false);
		btn_tru.setBorder(null);
		btn_tru.setForeground(new Color(255, 255, 255));
		btn_tru.setBackground(new Color(0, 102, 204));
		btn_tru.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_tru.setBounds(254, 364, 80, 50);
		contentPane.add(btn_tru);
				
		JButton btn_nhan = new JButton("×");
		btn_nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumbers = Double.parseDouble(standard_hienthi.getText());
				standard_hienthi.setText("");
				operation = "*";	
			}
		});
		btn_nhan.setFocusPainted(false);
		btn_nhan.setBorder(null);
		btn_nhan.setBackground(new Color(0, 102, 204));
		btn_nhan.setForeground(new Color(255, 255, 255));
		btn_nhan.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_nhan.setBounds(254, 311, 80, 50);
		contentPane.add(btn_nhan);
				
		JButton btn_chia = new JButton("÷");
		btn_chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumbers = Double.parseDouble(standard_hienthi.getText());
				standard_hienthi.setText("");
				operation = "/";  
			}
		});
		btn_chia.setFocusPainted(false);
		btn_chia.setBorder(null);
		btn_chia.setForeground(new Color(255, 255, 255));
		btn_chia.setBackground(new Color(0, 102, 204));
		btn_chia.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_chia.setBounds(254, 258, 80, 50);
		contentPane.add(btn_chia);
		
		JButton btn_convert = new JButton("Convert");
		btn_convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  
				if(temperature.isEnabled()) {
					String box_1 = (String) temperature_donvi_1.getSelectedItem();
					String box_2 = (String) temperature_donvi_2.getSelectedItem();
					//---------------Đổi Celsius--------------- 
					if(box_1.equals("Celsius")&&box_2.equals("Celsius")) {
						double c = Double.parseDouble(temperature_hienthi.getText());
						temperature_ketqua.setText(String.valueOf(c));
					}
					else if(box_1.equals("Celsius")&&box_2.equals("Kelvin")) {
						double c = Double.parseDouble(temperature_hienthi.getText());
						double k = (double)(c+273.15 );
						temperature_ketqua.setText(String.valueOf(k));
					}
					else if(box_1.equals("Celsius")&&box_2.equals("Fahrenheit")) {
						double c = Double.parseDouble(temperature_hienthi.getText());
						double f = (double)(c*9/5+32);
						temperature_ketqua.setText(String.valueOf(f));
					}
					//---------------Đổi Kevin--------------- 
					else if(box_1.equals("Kelvin")&&box_2.equals("Kelvin")) {
						double k = Double.parseDouble(temperature_hienthi.getText());
						temperature_ketqua.setText(String.valueOf(k));
					}
					else if(box_1.equals("Kelvin")&&box_2.equals("Celsius")) {
						double k = Double.parseDouble(temperature_hienthi.getText());
				        double c = (double)(k-273.15);
				        temperature_ketqua.setText(String.valueOf(c));
					}
					else if(box_1.equals("Kelvin")&&box_2.equals("Fahrenheit")) {
						double k = Double.parseDouble(temperature_hienthi.getText());
					    double f = (double)(k*9/5-459.67);
					    temperature_ketqua.setText(String.valueOf(f));
					}
					//---------------Đổi Fahrenheit--------------- 
					else if(box_1.equals("Fahrenheit")&&box_2.equals("Fahrenheit")) {
						double f = Double.parseDouble(temperature_hienthi.getText());
						temperature_ketqua.setText(String.valueOf(f));
					}
					else if(box_1.equals("Fahrenheit")&&box_2.equals("Celsius")) {
						double f = Double.parseDouble(temperature_hienthi.getText());
						double c = (double)((f-32)*5/9);
				        temperature_ketqua.setText(String.valueOf(c));
					}
					else if(box_1.equals("Fahrenheit")&&box_2.equals("Kelvin")) {
						double f = Double.parseDouble(temperature_hienthi.getText());
						double k = (double)((f+459.67)*5/9);
					    temperature_ketqua.setText(String.valueOf(k));
					}
					if(temperature_ketqua.getText().endsWith(".0")) {
						temperature_ketqua.setText(temperature_ketqua.getText().replace(".0",""));
					}
					
				}
			}
		});
		btn_convert.setFocusPainted(false);
		btn_convert.setForeground(Color.WHITE);
		btn_convert.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_convert.setBorder(null);
		btn_convert.setBackground(new Color(0, 102, 204));
		btn_convert.setBounds(171, 205, 163, 50);
		contentPane.add(btn_convert); 
				
		JButton btn_bang = new JButton("=");
		btn_bang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(standard.isEnabled()) {
					secondnumbers = Double.parseDouble(standard_hienthi.getText());
					if(operation == "+") {
						standard_ketqua.setText(String.valueOf(firstnumbers+secondnumbers));
					}
					else if(operation == "-") {
						standard_ketqua.setText(String.valueOf(firstnumbers-secondnumbers));
					}
					else if(operation == "*") {
						standard_ketqua.setText(String.valueOf(firstnumbers*secondnumbers));
					}
					else if(operation == "/") {
						if(secondnumbers==0) {
							standard_ketqua.setText(String.valueOf("Không chia được cho 0"));
						}
						else {
							standard_ketqua.setText(String.valueOf(firstnumbers/secondnumbers));
						}
					}
					else if(operation == "sqrt") {
							standard_hienthi.setText(String.valueOf("√("+firstnumbers+")"));
							standard_ketqua.setText(String.valueOf(Math.sqrt(firstnumbers)));
					}
					if(standard_ketqua.getText().endsWith(".0")) {
						standard_ketqua.setText(standard_ketqua.getText().replace(".0",""));
					}
				}
			}
		});
		btn_bang.setFocusPainted(false);
		btn_bang.setBorder(null);
		btn_bang.setForeground(new Color(255, 255, 255));
		btn_bang.setBackground(new Color(0, 102, 204));
		btn_bang.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_bang.setBounds(254, 470, 80, 50);
		contentPane.add(btn_bang);
		
		//---------Button action---------
		JButton btn_xoahet = new JButton("AC");
		btn_xoahet.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(standard.isEnabled()) {
					standard_hienthi.setText(null);
					standard_ketqua.setText(null);
				}
				if(length.isEnabled()) {
					length_hienthi.setText(null);
					length_ketqua.setText(null);
				}
				if(temperature.isEnabled()) {
					temperature_hienthi.setText(null);
					temperature_ketqua.setText(null);
				}
			}
		});
		btn_xoahet.setFocusPainted(false);
		btn_xoahet.setForeground(new Color(255, 255, 255));
		btn_xoahet.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_xoahet.setBorder(null);
		btn_xoahet.setBackground(new Color(0, 102, 204));
		btn_xoahet.setBounds(5, 205, 80, 50);
		contentPane.add(btn_xoahet);
		
		JButton btn_xoa1phantu = new JButton("C");
		btn_xoa1phantu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace=null;
				if(standard.isEnabled()) {
					if(standard_hienthi.getText().length()>0) {
						StringBuilder builder =  new StringBuilder(standard_hienthi.getText());
						builder.deleteCharAt(standard_hienthi.getText().length()-1);
						Backspace = builder.toString();
						standard_hienthi.setText(Backspace);
					}
				}
				if(length.isEnabled()) {
					if(length_hienthi.getText().length()>0) {
						StringBuilder builder =  new StringBuilder(length_hienthi.getText());
						builder.deleteCharAt(length_hienthi.getText().length()-1);
						Backspace = builder.toString();
						length_hienthi.setText(Backspace);
					}
				}
				if(temperature.isEnabled()) {
					if(temperature_hienthi.getText().length()>0) {
						StringBuilder builder =  new StringBuilder(temperature_hienthi.getText());
						builder.deleteCharAt(temperature_hienthi.getText().length()-1);
						Backspace = builder.toString();
						temperature_hienthi.setText(Backspace);
					}
				}
			}
		});
		btn_xoa1phantu.setFocusPainted(false);
		btn_xoa1phantu.setForeground(Color.WHITE);
		btn_xoa1phantu.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_xoa1phantu.setBorder(null);
		btn_xoa1phantu.setBackground(new Color(0, 102, 204));
		btn_xoa1phantu.setBounds(88, 205, 80, 50);
		contentPane.add(btn_xoa1phantu);
		
		//---------Đơn vị---------
		length_donvi_1 = new JComboBox();
		length_donvi_1.setBackground(new Color(255, 255, 51));
		length_donvi_1.setMaximumRowCount(9);
		length_donvi_1.setModel(new DefaultComboBoxModel(new String[] {"Micromet", "Millimet", "Centimet", "Met", "Kilomet", "Inch", "Feet", "Yard", "Mile"}));
		length_donvi_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		length_donvi_1.setBounds(239, 88, 95, 22);
		contentPane.add(length_donvi_1);
		
		length_donvi_2 = new JComboBox();
		length_donvi_2.setModel(new DefaultComboBoxModel(new String[] {"Micromet", "Millimet", "Centimet", "Met", "Kilomet", "Inch", "Feet", "Yard", "Mile"}));
		length_donvi_2.setMaximumRowCount(9);
		length_donvi_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		length_donvi_2.setBackground(new Color(255, 255, 51));
		length_donvi_2.setBounds(239, 175, 95, 22);
		contentPane.add(length_donvi_2);

		temperature_donvi_1 = new JComboBox();
		temperature_donvi_1.setBackground(new Color(255, 255, 51));
		temperature_donvi_1.setMaximumRowCount(9);
		temperature_donvi_1.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Kelvin", "Fahrenheit"}));
		temperature_donvi_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		temperature_donvi_1.setBounds(239, 88, 95, 22);
		contentPane.add(temperature_donvi_1);
		
		temperature_donvi_2 = new JComboBox();
		temperature_donvi_2.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Kelvin", "Fahrenheit"}));
		temperature_donvi_2.setMaximumRowCount(9);
		temperature_donvi_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		temperature_donvi_2.setBackground(new Color(255, 255, 51));
		temperature_donvi_2.setBounds(239, 175, 95, 22);
		contentPane.add(temperature_donvi_2);
		
		
		}
	}

