import java.util.Scanner;

/**
 * 
 */
class Method
{
	//First Method Call
public void sum(int a,int b)
{
int c=a+b;
System.out.println("First Method\nSum of Two Number="+c);

}
//Second Call
public void sum(double a, double b)
{
double c=a+b;
System.out.println("Second Method Call\nSum of Two Number="+c);

}
public void sum(float a, float b)
{
float c=a+b;
System.out.println("Third Method Call\nSum of two number:"+c);
}
}



/**
 * @author sahil
 *
 */
public class Overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Method ob=new Method();
		System.out.println("Enter Two Numbers:");
		/*int a = scan.nextInt();
		  int b = scan.nextInt();*/
		ob.sum(10,20);
	}
}
