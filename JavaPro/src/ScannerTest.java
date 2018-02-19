import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
/*		Scanner sc= new Scanner(System.in);
		
		int i = sc.nextInt();
		double d= sc.nextDouble();
		//sc.nextLine();
		String s= sc.nextLine();

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);*/
		

		 long x=-150;
         System.out.println(x+" can be fitted in:");
         if(x>=-128 && x<=127)System.out.println("* byte");
         if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
         if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
         if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
		
		/* Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int hh=a;
	             for(int k=0;k<n;k++){
	                hh=hh+(int)Math.pow(2,k)*b;
	                System.out.print(hh+" ");
	             }
	            
	             System.out.println();
	        }
	        in.close();
		
		
		
		*/
		
	}

}
 