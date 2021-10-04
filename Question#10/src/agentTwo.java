class agentTwo extends Thread{
   private account p=new account();
    public void run(account n,int money)
    {
        n.credit(money);
        t(n);
    }
    void t(account n)
    {
        p=n;
    }
    
    account retu()
    {
        return p;
    }
}