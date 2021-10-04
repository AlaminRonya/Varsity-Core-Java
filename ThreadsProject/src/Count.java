
public class Count extends Thread{
	Count ()
	{
	 super("my extending thread");
	System.out.println("my thread created");
	start();
	}
	public void run()
	{
	try
	{
	for(int i=10;i>0;i--)
	{
	System.out.println("Thread Number" + i);
	Thread.sleep(500);
	}
	}
	catch(InterruptedException e)
	{
	System.out.println("my thread interrupted");
	}
	System.out.println("My thread run is over");
	}

}
