
public class TestStudent {

	public static void main(String[] args) {
		Student tom =new Student(1001,"Tom","Java",9999,true);
		tom.print();
		tom.setFees(tom.getFees()+1000);
		System.out.println("Now New Fees is "+tom.getFees());
//		System.out.println("Id "+tom.id);  // (Ref)66.id
//		System.out.println("Name "+tom.name);
//		System.out.println("Course "+tom.course);
		//tom.takeInput(-1001,"Tom", -9999, true);
//		tom.id = -1001;
//		tom.name = "Tom";
//		tom.course = "Java";
//		tom.fees=-90000;
		//tom.print();
//		System.out.println("Id "+tom.id);  // (Ref)66.id
//		System.out.println("Name "+tom.name);
//		System.out.println("Course "+tom.course);
		System.out.println("*******************************");
		Student kim = new Student();
		kim.print();
//		System.out.println("Id "+kim.id);  // (Ref)66.id
//		System.out.println("Name "+kim.name);
//		System.out.println("Course "+kim.course);
		
		
//		//String w = "Hello";
//		Student shyam=new Student();
//		//int a ;
//		//a++;
//		System.out.println(shyam.id);
//		
//		Student ram = new Student();
//		if(ram==shyam){
//			System.out.println("Same Address");
//		}
//		else
//		{
//			System.out.println("Not Same Address");
//		}
//		int x= 100;
//		ram.id = -1001;
//		ram.name = "Ram";
//		ram.course = "MCA";
//		ram.fees=-10000;
//		ram.att=true;
//				
//		System.out.println("Id "+ram.id);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
//		System.out.println("Fees "+ram.fees);
//		System.out.println("Att "+ram.att);
		

	}

}
