
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mohd sahil";
		System.out.println(str);
		int len=str.length();
		System.out.println("length of string="+len);
		
		int last_ind=str.lastIndexOf("l");
		System.out.println("last index of string="+last_ind);
		
		int index=str.indexOf("s");
		System.out.println("index of="+index);
		
		String upper=str.toUpperCase();
		System.out.println("Upper case="+upper);
		
		boolean eq=upper.equals(str);
		System.out.println(eq);
		
		boolean eq1=upper.equalsIgnoreCase(str);
		System.out.println(eq1);
		
		char eq2=str.charAt(3);
		System.out.println("Character of str "+eq2);
		
		String str1="mohd";
		String str2="Mohd";
		//compare two string
		
		int comp=str1.compareTo(str2);
		System.out.println(comp);
		
		//find vowel & consonants

		int count1=0;
		int count=0;
		int  count2=0;
		for(int i=0; i<len; i++)
		{

			char vowel=str.charAt(i);
			if((vowel=='a' )||(vowel=='o' )||(vowel=='i' )||(vowel=='e' )||(vowel=='u'))
			{
				
				count++;
			}
			else if(vowel==' ')
			{
				count2++;
			}
	
			else
			{
				count1++;
			}
			
			
		}

		System.out.println("Vowel "+count);
		System.out.println("Consonant "+count1);
		System.out.println("blank space "+count2);
	}

}
