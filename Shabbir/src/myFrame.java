import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class myFrame extends JFrame{
	myFrame(){
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Login this");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("logo.png");
		this.setIconImage(icon.getImage());
		//this.getContentPane().setBackground(Color.GREEN);	
		this.getContentPane().setBackground(new Color(243,50,255));
	}
}
