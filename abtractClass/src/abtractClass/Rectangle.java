package abtractClass;

public class Rectangle extends Calculation_geometry{
	
	private double length;
	private double width;
	

	public Rectangle() {
		this.length = 1.0;
		this.width = 0.5;
	}
	

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getLength()+getWidth();
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*(getLength()+getWidth());
	}

}
