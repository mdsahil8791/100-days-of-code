import java.io.IOException;
import java.util.Scanner;


public class NumberPyramid {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//int  ch='A';
		int temp=0;
		for(int i=0; i<5; i++)
		{
			for(int s=5; s>i;s--)
			{
			//	char ch=(char)j;
				System.out.print("  ");
			}
			int k=2*i+1; int temp1=k-k/2;
			for(int j=0; j<=k/2; j++){
			++temp;
			System.out.print(temp+" ");
			//if()
			
			//temp++;
			}
			while(temp1>1)
			{
			System.out.print(--temp+" ");
			temp1--;
			}
			//temp++;
			System.out.println();
			//temp++;
		}
    
	}

	

}
