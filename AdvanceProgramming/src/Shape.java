
public class Shape {
	private double height;
	private double length;
	private double base;
	private double radius;
	public Shape(double height, double length, double base, double radius) {
		this.height = height;
		this.length = length;
		this.base = base;
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void rectangleOfArea() {
		double area = getHeight()*getLength();
		System.out.println("Rectangle Of Area : "+area);
	}
	public void squareOfArea() {
		double area = getLength()*getLength();
		System.out.println("Square Of Area : "+area);
	}
	public void triangleOfArea() {
		double area = 0.5*getBase()*getHeight();
		System.out.println("Triangle Of Area : "+area);
	}
	public void circleOfArea() {
		double area = 3.1416*getRadius()*getRadius();
		System.out.println("Circle Of Area : "+area);
	}
	

}
