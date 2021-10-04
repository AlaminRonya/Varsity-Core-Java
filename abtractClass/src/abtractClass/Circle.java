package abtractClass;

public class Circle extends Calculation_geometry{
	private double radius ;
	private double PI =  3.1416;
	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getradius() {return this.radius;}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*getradius()*getradius();
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*PI*getradius();
	}

}
