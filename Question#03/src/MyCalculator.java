
public class MyCalculator implements AdvancedArithmetic {
	
	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i = 1;i<=n; i++) {
			if(n%i==0) {
				sum += i ;
			}
		}
		return (sum);
	}
	public void print(int n) {
		System.out.println(n+" Divisor Sum : "+this.divisor_sum(n));
	}

}
