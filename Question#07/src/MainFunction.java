import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
            Myexecption m = new Myexecption();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value: ");
            int n = scan.nextInt();
            m.compute(n);
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
    }
    
    
     
}


