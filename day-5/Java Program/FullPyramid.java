import java.io.IOException;
import java.util.Scanner;


public class FullPyramid {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//int  ch='A';
		for(int i=0; i<5; i++)
		{
			for(int s=5; s>i;s--)
			{
			//	char ch=(char)j;
				System.out.print("  ");
			}
			for(int j=0; j<2*i+1; j++)
			//ch++;
			System.out.print("* ");
			
			System.out.println();
			
		}
    
	}

	

}
