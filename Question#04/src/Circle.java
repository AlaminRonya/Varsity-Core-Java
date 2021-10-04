
public class Circle implements GeometricObject {
	private double radious;
	

	public Circle(double radious) {
		this.radious = radious;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2*3.1416*this.radious*this.radious);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2*3.1416*this.radious);
	}

	@Override
	public String toString() {
		return "Circle [radious=" + this.radious + ", getArea()=" + this.getArea() + ", getPerimeter()=" + this.getPerimeter()+ "]";
	}

	

	
	

}
