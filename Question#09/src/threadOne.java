class threadOne extends Thread{
    
    public void run()
    {
        while(true)
        {
            System.out.println("hi");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    
}