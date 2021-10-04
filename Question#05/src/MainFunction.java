import pkg1.B;
import pkg2.C;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Printing from another class from same Package:");
        
        B x=new B();
        x.setValueOfA(5,10,14,12);
        x.print();
        System.out.println("Printing from another class from Another Package:");
        
        C c = new C();
        
        c.setValueOfA(5,17,2,3);
        
        c.print();

	}

}
