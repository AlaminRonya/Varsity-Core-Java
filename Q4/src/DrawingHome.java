import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DrawingHome extends JComponent {
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d =  (Graphics2D) g;
		//Circle
		int[] xPoints = {150,250,350};
		int[] yPoints = {100,50,100};
		g2d.setPaint(Color.RED);
		g2d.fillPolygon(xPoints, yPoints, 3);
		//Circle end
		
		
		  
		Rectangle2D.Double body = new Rectangle2D.Double(150,100,200,100);
		g2d.setColor(Color.GREEN);
		g2d.fill(body); 
		
		Rectangle2D.Double door = new Rectangle2D.Double(220,150,50,50);
		g2d.setColor(Color.YELLOW);
		g2d.fill(door);
		
		Ellipse2D.Double c = new Ellipse2D.Double(220,175,10,10);
		g2d.setColor(Color.RED);
		g2d.fill(c);
		
		Rectangle2D.Double window1 = new Rectangle2D.Double(170,150,30,30);
		g2d.setColor(Color.WHITE);
		g2d.fill(window1);
		
		Rectangle2D.Double window2 = new Rectangle2D.Double(300,150,30,30);
		g2d.setColor(Color.WHITE);
		g2d.fill(window2);
		
		Rectangle2D.Double bar = new Rectangle2D.Double(300,50,30,50);
		g2d.setColor(Color.RED);
		g2d.fill(bar); 
	}

}
