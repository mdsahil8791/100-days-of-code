import java.io.IOException;
import java.util.Scanner;


public class HalfPramid {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int  ch='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i;j++)
			{
			//	char ch=(char)j;
				System.out.print((char)ch+" ");
			}
			ch++;
			System.out.println();
		}
    
	}

	

}
