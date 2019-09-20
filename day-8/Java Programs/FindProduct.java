import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.math;


class FindProduct{

	public static void main(String[] args) throws Exception{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//Input size of Array:
	int n=Integer.parseInt(br.readLine());
	
	//Input elements with space seperated:
	String[] s1=br.readLine().trim().split(" ");
	
	//Initialize Array;
	int[] arr=new int[n];

	long answer=1;	
//Now convert values String into Integer Array:
for(int i=0; i<n; i++)
{

	arr[i]=Integer.parseInt(s1[i]);
	answer=(long)((answer*arr[i])%(Math.pow(10,9)+7));
}

	System.out.println(answer);

}
}