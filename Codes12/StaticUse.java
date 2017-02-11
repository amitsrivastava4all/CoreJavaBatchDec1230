

/*
 * static variable
 * static block
 * Static Method
 * Static Method in Interface
 * Static Import
 */
import static java.lang.System.out;
class Customer{
	Account account = new Account();
	Order order = new Order();
}
class Account
{
	
}
class Order
{
	
}
// Nested Class
class A1
{
	static int pp;
	static class B{
		static void print(){
			System.out.println("B Print call...");
		}
	}
}
class ATMCaller
{
	void call(){
		ATM obj  = new ATM();
		//ATM.w=new WithDrawal();
		ATM.w.p++;
		ATM.c = new Checking();
		ATM obj2  = new ATM();
		ATM obj3  = new ATM();
		
	}
}
class ATM
{
	final static int x=100;
	final static WithDrawal w = new WithDrawal();
	static Checking c = new Checking();
}

class WithDrawal
{
	int p=10;
}
class Checking
{
	
}

// Utility Classes
// Utility Interface
interface MathOperation{
//final class MathOperation{
	//private MathOperation(){}
	static int multiply(int x, int y){
		return x + y;
	}
	static int cube(int x){
		return x * x * x;
	}
}

class Test
{
	static int a;
	int b;
	Test(){
		a++;
		b++;
		out.println("Cons Call a is "+a+ " b is "+b);
		
		
	}
	static{
		out.println(" I will Calll When Class is Loaded.. "+a);
	}
}
public class StaticUse {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub	
		//MathOperation m = new MathOperation();
		A1.B.print();
		MathOperation.cube(3);
		// 1st Way
		
		System.out.println("Main Call");
		System.out.println(Test.a);
		Customer ram  =new Customer();
		//Class.forName("Test");
//		Test obj = new Test();
//		Test obj2 = new Test();
//		Test obj3 = new Test();
		

	}

}
