
public class TestStudent {

	public static void main(String[] args) {
		//String w = "Hello";
		Student shyam=new Student();
		//int a ;
		//a++;
		System.out.println(shyam.id);
		
		Student ram = new Student();
		if(ram==shyam){
			System.out.println("Same Address");
		}
		else
		{
			System.out.println("Not Same Address");
		}
		int x= 100;
		ram.id = -1001;
		ram.name = "Ram";
		ram.course = "MCA";
		ram.fees=-10000;
		ram.att=true;
				
		System.out.println("Id "+ram.id);
		System.out.println("Name "+ram.name);
		System.out.println("Course "+ram.course);
		System.out.println("Fees "+ram.fees);
		System.out.println("Att "+ram.att);
		

	}

}
