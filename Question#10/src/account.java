class account{
    private int money=0;
    void credit(int n)
    {
        money+=n;
    }
    void show()
    {
        System.out.println(money);
    }
    
}