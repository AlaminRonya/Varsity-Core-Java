class threadThree extends Thread{
   public void run()
    {
        while(true)
        {
            System.out.println("Good Morning");
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }
}