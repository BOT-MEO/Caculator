package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		  
		
		//---------Các button số từ 0 đến 9---------
		JButton btn_so_0 = new JButton("0\r\n");
		btn_so_0.setBorder(null);
		btn_so_0.setBackground(new Color(255, 102, 0));
		btn_so_0.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_0.setForeground(new Color(255, 255, 255));
		btn_so_0.setBounds(5, 445, 80, 50);
		contentPane.add(btn_so_0);
		
		JButton btn_so_1 = new JButton("1\r\n");
		btn_so_1.setBorder(null);
		btn_so_1.setBackground(new Color(255, 102, 0));
		btn_so_1.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_1.setForeground(new Color(255, 255, 255));
		btn_so_1.setBounds(5, 392, 80, 50);
		contentPane.add(btn_so_1);
		
		JButton btn_so_2 = new JButton("2\r\n");
		btn_so_2.setBorder(null);
		btn_so_2.setBackground(new Color(255, 102, 0));
		btn_so_2.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_2.setForeground(new Color(255, 255, 255));
		btn_so_2.setBounds(88, 392, 80, 50);
		contentPane.add(btn_so_2);
		
		JButton btn_so_3 = new JButton("3");
		btn_so_3.setBorder(null);
		btn_so_3.setBackground(new Color(255, 102, 0));
		btn_so_3.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_3.setForeground(new Color(255, 255, 255));
		btn_so_3.setBounds(171, 392, 80, 50);
		contentPane.add(btn_so_3);
		
		JButton btn_so_6 = new JButton("6");
		btn_so_6.setBorder(null);
		btn_so_6.setBackground(new Color(255, 102, 0));
		btn_so_6.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_6.setForeground(new Color(255, 255, 255));
		btn_so_6.setBounds(171, 339, 80, 50);
		contentPane.add(btn_so_6);
		
		JButton btn_so_5 = new JButton("5\r\n");
		btn_so_5.setBorder(null);
		btn_so_5.setBackground(new Color(255, 102, 0));
		btn_so_5.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_5.setForeground(new Color(255, 255, 255));
		btn_so_5.setBounds(88, 339, 80, 50);
		contentPane.add(btn_so_5);
		
		JButton btn_so_4 = new JButton("4");
		btn_so_4.setBorder(null);
		btn_so_4.setBackground(new Color(255, 102, 0));
		btn_so_4.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_4.setForeground(new Color(255, 255, 255));
		btn_so_4.setBounds(5, 339, 80, 50);
		contentPane.add(btn_so_4);
		
		JButton btn_so_7 = new JButton("7");
		btn_so_7.setBorder(null);
		btn_so_7.setBackground(new Color(255, 102, 0));
		btn_so_7.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_7.setForeground(new Color(255, 255, 255));
		btn_so_7.setBounds(5, 286, 80, 50);
		contentPane.add(btn_so_7);
		
		JButton btn_so_8 = new JButton("8");
		btn_so_8.setBorder(null);
		btn_so_8.setBackground(new Color(255, 102, 0));
		btn_so_8.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_8.setForeground(new Color(255, 255, 255));
		btn_so_8.setBounds(88, 286, 80, 50);
		contentPane.add(btn_so_8);
		
		JButton btn_so_9 = new JButton("9");
		btn_so_9.setBorder(null);
		btn_so_9.setBackground(new Color(255, 102, 0));
		btn_so_9.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_so_9.setForeground(new Color(255, 255, 255));
		btn_so_9.setBounds(171, 286, 80, 50);
		contentPane.add(btn_so_9);
		
		//---------Button hàm---------
		JButton btn_sothuc = new JButton(".");
		btn_sothuc.setBorder(null);
		btn_sothuc.setBackground(new Color(255, 51, 0));
		btn_sothuc.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_sothuc.setForeground(new Color(255, 255, 255));
		btn_sothuc.setBounds(171, 445, 80, 50);
		contentPane.add(btn_sothuc);
		
		JButton btn_am = new JButton("\u00B1");
		btn_am.setBorder(null);
		btn_am.setBackground(new Color(255, 51, 0));
		btn_am.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_am.setForeground(new Color(255, 255, 255));
		btn_am.setBounds(88, 445, 80, 50);
		contentPane.add(btn_am);
		
		JButton btn_pi = new JButton("π");
		btn_pi.setForeground(Color.WHITE);
		btn_pi.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_pi.setBorder(null);
		btn_pi.setBackground(new Color(255, 51, 0));
		btn_pi.setBounds(254, 180, 80, 50);
		contentPane.add(btn_pi);
		
		JButton btn_phantram = new JButton("%\r\n");
		btn_phantram.setForeground(Color.WHITE);
		btn_phantram.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_phantram.setBorder(null);
		btn_phantram.setBackground(new Color(255, 51, 0));
		btn_phantram.setBounds(171, 180, 80, 50);
		contentPane.add(btn_phantram);
		
		JButton btn_canbac2 = new JButton("√");
		btn_canbac2.setBorder(null);
		btn_canbac2.setBackground(new Color(255, 51, 0));
		btn_canbac2.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_canbac2.setForeground(new Color(255, 255, 255));
		btn_canbac2.setBounds(171, 233, 80, 50);
		contentPane.add(btn_canbac2);
		
		JButton btn_1trenx = new JButton("1/x");
		btn_1trenx.setBorder(null);
		btn_1trenx.setForeground(new Color(255, 255, 255));
		btn_1trenx.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_1trenx.setBackground(new Color(255, 51, 0));
		btn_1trenx.setBounds(5, 233, 80, 50);
		contentPane.add(btn_1trenx);
		
		JButton btn_xmun = new JButton("xⁿ\r\n");
		btn_xmun.setBorder(null);
		btn_xmun.setForeground(new Color(255, 255, 255));
		btn_xmun.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_xmun.setBackground(new Color(255, 51, 0));
		btn_xmun.setBounds(88, 233, 80, 50);
		contentPane.add(btn_xmun);
		
		//---------Button tính toán---------
		JButton btn_cong = new JButton("+");
		btn_cong.setBorder(null);
		btn_cong.setForeground(new Color(255, 255, 255));
		btn_cong.setBackground(new Color(255, 51, 0));
		btn_cong.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_cong.setBounds(254, 392, 80, 50);
		contentPane.add(btn_cong);
				
		JButton btn_tru = new JButton("\u2013");
		btn_tru.setBorder(null);
		btn_tru.setForeground(new Color(255, 255, 255));
		btn_tru.setBackground(new Color(255, 51, 0));
		btn_tru.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_tru.setBounds(254, 339, 80, 50);
		contentPane.add(btn_tru);
				
		JButton btn_nhan = new JButton("\u00D7");
		btn_nhan.setBorder(null);
		btn_nhan.setBackground(new Color(255, 51, 0));
		btn_nhan.setForeground(new Color(255, 255, 255));
		btn_nhan.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_nhan.setBounds(254, 286, 80, 50);
		contentPane.add(btn_nhan);
				
		JButton btn_chia = new JButton("\u00F7");
		btn_chia.setBorder(null);
		btn_chia.setForeground(new Color(255, 255, 255));
		btn_chia.setBackground(new Color(255, 51, 0));
		btn_chia.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_chia.setBounds(254, 233, 80, 50);
		contentPane.add(btn_chia);
				
		JButton btn_bang = new JButton("=");
		btn_bang.setBorder(null);
		btn_bang.setForeground(new Color(255, 255, 255));
		btn_bang.setBackground(new Color(255, 51, 0));
		btn_bang.setFont(new Font("Calibri", Font.BOLD, 30));
		btn_bang.setBounds(254, 445, 80, 50);
		contentPane.add(btn_bang);
		
		//---------Button action---------
		JButton btn_xoahet = new JButton("AC");
		btn_xoahet.setForeground(new Color(255, 255, 255));
		btn_xoahet.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_xoahet.setBorder(null);
		btn_xoahet.setBackground(new Color(255, 51, 0));
		btn_xoahet.setBounds(5, 180, 80, 50);
		contentPane.add(btn_xoahet);
		
		JButton btn_xoa1phantu = new JButton("C");
		btn_xoa1phantu.setForeground(Color.WHITE);
		btn_xoa1phantu.setFont(new Font("Calibri", Font.BOLD, 25));
		btn_xoa1phantu.setBorder(null);
		btn_xoa1phantu.setBackground(new Color(255, 51, 0));
		btn_xoa1phantu.setBounds(88, 180, 80, 50);
		contentPane.add(btn_xoa1phantu);
	}

}
