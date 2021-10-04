
public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread thread1  = new MyThread();
		//thread1.start();
		//obj.run();
		//ThreadImpements runable = new ThreadImpements();
		//Thread thread2 = new Thread(runable);
		//thread2.start();
		
		
		Count ont=new Count();
		try
		{
		while(ont.isAlive())
		{
		System.out.println("My final exam day");
		Thread.sleep(700);
		}
		}
		catch (InterruptedException e){
		System.out.println("Main thread interrupted");
		}
		System.out.println("My exam is over");

	}
	
}
