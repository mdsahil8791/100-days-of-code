import java.util.Scanner;


public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Nth term of fibonacci series:");
		int n=scan.nextInt();
		
		System.out.println("Fibonacci Series of:"+n);
		int a=0;
		//System.out.println(a);
		int b=1;
		//System.out.println(b);
		
		for(int i=1; i<=n; i++ )
		{
			System.out.print("|"+a);

			int c=a+b;
			a=b;
			b=c;
			//System.out.println(c);
		}

	}

}
