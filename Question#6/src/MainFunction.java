import java.util.*;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
	        System.out.println("Input the age: ");
	        int age=scan.nextInt();
	        System.out.println("Input the weight: ");
	        int weight=scan.nextInt();
	        
	        if((age<15&&age>6)&&weight>50)
	        {
	            if(age<15&&age>6)
	            {
	                try{
	                    throw new NullPointerException("Age is outside the range");
	                }
	                catch(NullPointerException e)
	                {
	                    System.out.println(e.getMessage());
	                }
	            }
	            if(weight>50)
	            {
	                try{
	                    throw new InvalidSpeedException("Weight is outside the range");
	                }
	                catch(Exception e)
	                {
	                    System.out.println(e.getMessage());
	                }
	            }
	        }
    	}
    
		static class InvalidSpeedException extends Exception {

			public InvalidSpeedException(String message){
				super(message);
			}

		}

}
