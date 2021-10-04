import javax.swing.JFrame;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w  = 640;
		int h = 480;
		JFrame f = new JFrame();
		DrawingHome dh = new DrawingHome();
		f.setSize(w, h);
		f.setTitle("Dwaring  home!");
		f.add(dh);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
