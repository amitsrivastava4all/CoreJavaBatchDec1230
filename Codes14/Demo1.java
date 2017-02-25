import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo1 {
	static Scanner scanner = new Scanner(System.in);
	static int firstNo ;
	static int secondNo ;
	static void takeFirstNo(){
		
		System.out.println("Enter the First No");
		try{
			firstNo =scanner.nextInt();
		}
		catch(InputMismatchException e){
			scanner.nextLine();
			System.out.println("Only Number Allowed ");
			takeFirstNo();
		}
	}
	static void takeSecondNo(){
		System.out.println("Enter the Second No");
		try{
			secondNo =scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed ");
			scanner.nextLine();
			takeSecondNo();
		}
	}
	static int result ;
	static void divide(){
		try{
		 result = firstNo/secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("Can't Divide a Number with Zero ");
			takeSecondNo();
			divide();
	}
	}
	static void result(){
		System.out.println("Result is "+result);
	}
	
	
	public static void main(String[] args) {
		PP obj = new PP(){
			@Override
			void show(){
				System.out.println("this is override show");
			}
			@Override
			void print(){
				System.out.println("this is override print..");
			}
		};
		obj.show();
		obj.print();
		takeFirstNo();
		takeSecondNo();
		divide();
		result();
		
		System.out.println("Now going to end this program");
		
		scanner.close();

	}

}

abstract class PP{
	void show(){
		System.out.println("Show ...");
		
	}
	abstract void print();
		
}
