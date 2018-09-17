import java.util.Scanner;


public class DigSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int r,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		while(num>0)
		{
		    r=num%10;
			sum=sum+r;
			num=num/10;
		}
		
		System.out.println("Sum of Digit="+sum);

	}

}
