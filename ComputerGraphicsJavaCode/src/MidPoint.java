import java.util.Scanner;

public class MidPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//(20,10)(30,18)
		int x1=0,y1=10,x2,y2,i=0;
		
		/*System.out.print("Enter the X1 : ");
		x1 = sc.nextInt();
		System.out.print("Enter the Y1 : ");
		y1 = sc.nextInt();*/
		
		
		/*System.out.print("Enter the X2 : ");
		x2 = sc.nextInt();
		System.out.print("Enter the Y2 : ");
		y2 = sc.nextInt();
		int dellY, dellX;
		dellX =x2 - x1;
		dellY=y2 -y1;
		int dInitial, dNew, dellD;
		dInitial = 2*dellY - dellX;
		dNew = dInitial;
		dellD = 2*(dellY - dellX);
		
//		int a,b;
		System.out.println("Dell Of X : "+dellX);
		System.out.println("Dell Of Y : "+dellY);
		System.out.println("D initial : "+dInitial);
		System.out.println("D new value : "+dNew);
		*/
		
		
		int R = 1- 10;
		int pK =R;
		int pK1 =R;
		
		System.out.println("(index )      ( P_k  )      ( P_k1  )          (X_k+1 )           ( Y_k+1 )          ( X , Y ) ");
		System.out.println();
		
		System.out.println("  "+i+"                 "+pK+"                             "+pK1+"                  "+2*x1+"                 "+2*y1+"               ("+x1+","+y1+")");
		//x++;
		while(!(x1>=y1)) {
			i++;
			
			
			if(pK<0) {
				x1++;
				pK1 =pK + 2*x1 + 1;
				//System.out.println("pK1= "+pK+" + "+2*x1+"+"+1);
				System.out.println("  "+i+"                 "+pK+"                 "+"pK1= "+pK+" + "+2*x1+"+"+1+"="+pK1+"                  "+2*x1+"                 "+2*y1+"               ("+x1+","+y1+")");
				
			}
			else {
				
				
				y1--;
				x1++;
				pK1 = pK + 2*x1 + 1 - 2*y1;
				//System.out.println("pK1= "+pK+" + "+2*x1+"+"+1+"-"+2*y1);
				System.out.println("  "+i+"                 "+pK+"                  "+"pK1= "+pK+" + "+2*x1+"+"+1+"="+pK1+"                  "+2*x1+"                 "+2*y1+"               ("+x1+","+y1+")");
				
				
				
			}
			pK = pK1;
			
			
		}

	}

}
