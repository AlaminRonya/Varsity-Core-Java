
public class Rectangle implements GeometricObject {
	private double width;
	private double length;
	
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.width*this.length);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.getArea()+this.getArea());
	}

	@Override
	public String toString() {
		return "Rectangle [width=" +this. width + ", length=" + this.length + ", getArea()=" + this.getArea() + ", getPerimeter()="+ this.getPerimeter() + "]";
	}
	

}
