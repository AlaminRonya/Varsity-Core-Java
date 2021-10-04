
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyButton extends JFrame implements ActionListener{
	JButton btn;
	MyButton(){
		btn = new JButton();
		btn.addActionListener(this);
		btn.setText("Click");
		btn.setBounds(200,100,100,50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 300);
		this.setVisible(true);
		this.add(btn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn) {
			JOptionPane.showMessageDialog(null, "Hi,Mam", "Md. Jahangir Alam", JOptionPane.PLAIN_MESSAGE);
		}
	}

	

}
