import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MAinFunction {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		int hours,wagePerHour;
		System.out.print("Enter the hours of work : ");
		hours = sc.nextInt();
		System.out.print("Enter the wage per hour : ");
		wagePerHour = sc.nextInt();
		System.out.println("Gross Pay : "+hours*wagePerHour);*/
		/*JFrame frame  = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("Login Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("logo.png");
		frame.setIconImage(icon.getImage());
		//frame.getContentPane().setBackground(Color.GREEN);	
		frame.getContentPane().setBackground(new Color(0,0,255));*/
//		JFrame frame  = new JFrame();
//		frame.setVisible(true);
//		frame.setSize(500, 500);
//		frame.setTitle("Login Frame");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		Border border = BorderFactory.createLineBorder(Color.BLUE,3);
//		JLabel label = new JLabel();
//		label.setText("My First Label !" );
//		frame.add(label);
//		ImageIcon icon = new ImageIcon("logo.png");
//		label.setIcon(icon);
//		label.setHorizontalTextPosition(JLabel.CENTER);
//		label.setVerticalTextPosition(JLabel.TOP);
//		label.setForeground(new Color(0,122,23));
//		label.setFont(new Font("MV Boli",Font.PLAIN,20));
//		label.setIconTextGap(-25);
//		label.setBackground(Color.BLACK);
//		label.setOpaque(true);
//		label.setBorder(border);
//		label.setVerticalAlignment(JLabel.CENTER);
//		label.setHorizontalAlignment(JLabel.CENTER);
//		
//		JButton btn = new JButton("Button");
//		btn.setBounds(150,25 , 150, 25);
		
		JPanel panel = new JPanel();
		panel.setBounds(0,0, 150, 150);
		panel.setBackground(Color.BLUE);
		JButton btn = new JButton("Button");
		btn.setBounds(150, 10, 10, 150);
		btn.setBackground(Color.black);
		btn.setBorder(null);
		
		panel.add(btn);
		
		JFrame frame  = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("Login Frame");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.add(panel);
		
	}

}
