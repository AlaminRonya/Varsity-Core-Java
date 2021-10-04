
public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account n=new account();
        agentOne one= new agentOne();
        one.start();
        one.run(n,5000);
        n=one.retu();
        n.show();
        
        agentTwo two= new agentTwo();
        two.start();
        two.run(n,2000);
        n=two.retu();
        n.show();
        
        agentThree three= new agentThree();
        three.start();
        three.run(n,1000);
        n=three.retu();
        n.show();

	}

}
