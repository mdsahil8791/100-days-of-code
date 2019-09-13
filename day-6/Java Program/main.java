import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		int t = Integer.parseInt(br.readLine());
		//System.out.println("Welcome:"+t);
		while(t-->0)
		{
			String[] s1= br.readLine().trim().split(" ");
			int n=Integer.parseInt(s1[0]);
			//System.out.println("Value of n:"+n);
			
			int k = Integer.parseInt(s1[1]);
			int num=0,ind=0;
			//System.out.println("Value of K:"+k);
			
			String[] s2=br.readLine().trim().split(" ");
			int[] arr = new int[s2.length];
			
			for(int i=0; i<s2.length; i++)
			{
				arr[i]=Integer.parseInt(s2[i]);
			}
			for(int j=0; j<s2.length; j++){
				if(k==arr[j]){
				num=arr[j];
				ind=j+1;
				
				break;}
			}
			if(k==num)
				System.out.println(ind);
			else
				System.out.println("-1");
		}
	
		

	}

	

}
