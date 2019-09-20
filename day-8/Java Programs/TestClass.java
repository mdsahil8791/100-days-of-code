import java.util.*;

class TestClass {
    
public static void main(String args[] ) throws Exception {
  Scanner scan=new Scanner(System.in);

        int t=scan.nextInt();
        
	for(int i=1; i<=t; i++)
{

 	int n=scan.nextInt();

            int sum=0;
       
     for(int j=1; j<=n/2; j++){

                if(n%j==0)
              
                 sum+=j;

	  }

       System.out.println(sum);

        }
        


    }
}