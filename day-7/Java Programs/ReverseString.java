import java.io.InputStreamReader;
import java.io.BufferedReader;

class ReverseString {
public static void main(String[] args) throws Exception
{
	//Scanner scan=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int t=Integer.parseInt(br.readLine());

	for(int i=1; i<=t; i++)
	{
		//String s1="";
		//take input as String Array:
		String[] s2=br.readLine().trim().split("\\.");

		//find Size of string using "length" method:
		
		int size=s2.length;
		
		//And then print String Reverse Array: 
		for(int j=size-1; j>0; j--)
		{

			System.out.print(s2[j]+".");
		}

	System.out.println(s2[0]);


	}



}

}