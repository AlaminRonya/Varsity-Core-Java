import java.util.Scanner;

public class BresenhamAlgorithmMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			
		double x1=9,y1=18;
		double x2=14,y2=22;
		System.out.print("Enter the X1 : ");
		x1 = sc.nextDouble();
		System.out.print("Enter the Y1 : ");
		y1 = sc.nextDouble();
		System.out.print("Enter the X2 : ");
		x2 = sc.nextDouble();
		System.out.print("Enter the Y2 : ");
		y2 = sc.nextDouble();
		
		double dellY = y2 - y1;
		double dellX = x2 - x1;
//		double m =(y2-y1)/(x2-x1);
//		System.out.println(m);
		double twoDellY = 2*dellY;
		double twoDellYMinasTwoDellX = ((2*dellY) - (2*dellX));
		System.out.println("dellX : "+dellX );
		System.out.println("dellY : "+dellY );
		System.out.println("twoDellY : "+twoDellY );
		System.out.println("twoDellYMinasTwoDellX : "+twoDellYMinasTwoDellX );
		
		double p = twoDellY - dellX;
		double pk=0.0;
		int a,b,i=0;
		System.out.println("(index )    ( Pk  )          ( Pk+1 )           ( X , Y )                (Xk+1)             (Xk+1)  ");
		System.out.println();
		System.out.println("  "+i+"         "+"Initial"+"             "+Math.round(p)+"                ("+Math.round(x1)+","+Math.round(y1)+")"+"                   "+Math.round(x1)+"                "+Math.round(y1));
		
		//x++;
		while(!((x1>=x2)&&(y1>=y2))) {
			i++;
			x1++;
			if(p<0) {
				pk = p+twoDellY;
				System.out.println("  "+i+"           "+Math.round(p)+"                "+Math.round(pk)+"                 ("+Math.round(x1)+","+Math.round(y1)+")"+"                   "+Math.round(x1)+"                "+Math.round(y1));
				//System.out.println("  "+i+"            "+Math.round(p)+"           ("+Math.round(x1)+","+Math.round(y1)+")"+"                   "+Math.round(x1)+"                "+Math.round(y1));
				p = p+twoDellY;
			}
			else {
				y1++;
				pk = p+twoDellYMinasTwoDellX;
				System.out.println("  "+i+"           "+Math.round(p)+"                "+Math.round(pk)+"                 ("+Math.round(x1)+","+Math.round(y1)+")"+"                   "+Math.round(x1)+"                "+Math.round(y1));
				//System.out.println("  "+i+"            "+Math.round(p)+"           ("+Math.round(x1)+","+Math.round(y1)+")"+"                   "+Math.round(x1)+"                "+Math.round(y1));
				p = p+twoDellYMinasTwoDellX;
				
			}
			
			
		}
	}
              
}
