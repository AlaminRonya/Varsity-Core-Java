class Myexecption
{
    void compute(int n) throws Experiment
    {
        if(n<100||n>500)
        {
            throw new Experiment("Well caught");
        }
    }
        
}