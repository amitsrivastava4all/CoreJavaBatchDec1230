import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc
{
	Calc(){
		System.out.println("Calc Cons Call");
	}
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
}
class ScCalc
{
	ScCalc(){
		System.out.println("ScCalc Cons Call");
	}
	public int diff(int x, int y){
		return x - y;
	}
	public int power(int x, int y){
		return (int)Math.pow(x, y);
	}
}
class PP
{
	void print(){
		System.out.println("this is print");
	}
}
class DD extends PP{
	void print(){
		System.out.println("this is print");
	}
}
public class RefDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		PP obj = new DD();
		obj.print();
		System.out.println("Enter the ScCalc or Calc Name to Load");
		Scanner scanner= new Scanner(System.in);
		String className = scanner.next();
		// Class - java.lang.Class
		Object object = Class.forName(className).newInstance();
		System.out.println("Enter the Operation name to Call");
		String methodName = scanner.next();
		// java.lang.reflect.Method
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class);
		Object result= method.invoke(object, 10,20);
		System.out.println(result);
		Object t = "Amit";
		t = 100;
		t = 90.20;
		t = true;

	}

}
