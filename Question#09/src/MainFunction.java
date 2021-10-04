
public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadOne t1=new threadOne();
        threadTwo t2=new threadTwo();
        threadThree t3=new threadThree();
        
        t1.start();
        t2.start();
        t3.start();
        

	}

}
