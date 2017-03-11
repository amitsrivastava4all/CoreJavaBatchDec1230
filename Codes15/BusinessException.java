import java.io.File;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

// Step - 1 Inherit Exception , RuntimeException
class MinorAgeException extends RuntimeException {
	private int age;
	 MinorAgeException(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		//return null;
		return "Your Age is Minor "+age+" Age Must be >= 18 ";
	}
}
public class BusinessException {
	static void demo(){
		File file =new File("");
		//file.createNewFile();
	}
	
	static void demo2(){
		System.out.println("hello");
//		try{
//		throw new MinorAgeException();
//		}
//		catch(MinorAgeException e){
//			
//		}
		System.out.println("Never Execute this line");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		try{
		if(age<18){
			throw new MinorAgeException(age);
		}
//		if(age>=18){
//			System.out.println("Some Code...");
//		}
//		else
//		{
//			System.out.println("Some Other Code Will Run");
//		}
		System.out.println("Some Logic Going ON......");
		System.out.println("After This Some thing else will run");
		
		}
		catch(MinorAgeException e){
			System.out.println(e);
			//System.out.println("fhjkshgdfhghfdhgfdhgkdf");
		}
		//int pp = 100/0; // throw new ArithmeticException();
		Employee ram = new Employee(10, "Ram", 99999);
		System.out.println(ram);
		String name = new String("ram");
		System.out.println(name);
	}

}
