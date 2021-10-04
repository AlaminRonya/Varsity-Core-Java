import java.util.Scanner;

public class EvenNumberOfAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,sum=0;
		int avg;
		System.out.print("Enter the Positive Number : ");
		number = sc.nextInt();
		if(number%2==0) {
			int N = number/2;
			int even = 2;
			for(int i = 0; i<N; i++) {
				sum = sum + even;
				even += 2;
			}
			avg = sum/N;
			System.out.println("Average of Even Numbers : "+avg);
		}else {
			System.out.println("Please Enter the even number, try again!");
		}
		

	}

}
