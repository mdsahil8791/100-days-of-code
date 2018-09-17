class Student
{
	public Student(){
	System.out.println("Default Construcot Call");
}

	public Student(int x) {
		// TODO Auto-generated method stub
    System.out.println("First Constructor Call "+x);
		}
	public Student(String Name, int r_no){
		System.out.println("Your Name "+Name+" \nYour Roll_number "+r_no);
	}

	}
public class ConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student("Shalu",23);
		

	}

}
