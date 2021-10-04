import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		String str = "বাঙালি ভাষা অনুবাদ লোড হচ্ছে অনুগ্রহ করে অপেক্ষা করুন... ";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.print("Enter the Positive Number : ");
		num = sc.nextInt();
		for(int i = 0 ; i<num; i++) {
			for(int j =0; j<=i;j++) {
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		for(int i = 0 ; i<num; i++) {
			for(int j =num-2; j>=i;j--) {
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0 ; i<num; i++) {
			for(int j =num-1; j>=i;j--) {
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0 ; i<num; i++) {
			for(int j =0; j<=i;j++) {
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
