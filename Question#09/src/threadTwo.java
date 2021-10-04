class threadTwo extends Thread{
    
   public void run()
    {
        while(true)
        {
            System.out.println("hello");
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }
    
}