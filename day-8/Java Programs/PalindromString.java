
import java.util.Scanner;

class PalindromString{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	//Input String which contains only Lower Case:
	String s1=scan.nextLine().toLowerCase();

	//System.out.println("ToLowerCase: "+s1+"Size"+s1.length());

	String rev="";

	// Loop for doing reverse String:
	for(int i=s1.length()-1; i>=0; i--)
	{

		rev+=s1.charAt(i);
	
	}

	System.out.println(rev.equals(s1)?"YES":"NO");

	

}

}