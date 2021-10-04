package abtractClass;

public class maindemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle crl = new Circle();
		System.out.println("Circle Area : "+crl.area());
		System.out.println("Circle Circumference : "+crl.circumference());
		
		Circle crl1 = new Circle(2.5);
		System.out.println("Circle Area : "+crl1.area());
		System.out.println("Circle Circumference : "+crl1.circumference());
		
		Rectangle rect = new Rectangle();
		System.out.println("Rectangle Area : "+rect.area());
		System.out.println("Rectangle Circumference : "+rect.circumference());
		
		Rectangle rect1 = new Rectangle(2.5,3.5);
		System.out.println("Rectangle Area : "+rect1.area());
		System.out.println("Rectangle Circumference : "+rect1.circumference());

	}
	

}
