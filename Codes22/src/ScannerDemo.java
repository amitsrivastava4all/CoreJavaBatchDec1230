import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class W
{
	private int d;
	private int e;
	static int y;
	final int d1=1000;
	public int rr;
	void print(){
		
	}
	void show(){
		
	}
	void disp(){
		
	}
}
public class ScannerDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class cls = W.class; // Meta Info
		Field fields[] = cls.getDeclaredFields();
		for(Field field:fields){
			if(Modifier.isPrivate(field.getModifiers())){
				System.out.println("Private "+field.getName());
			}
			if(Modifier.isStatic(field.getModifiers())){
				System.out.println("Static "+field.getName());
			}
		}
		System.out.println(fields.length);
		Method methods[] = cls.getDeclaredMethods();
		System.out.println(methods.length);
		System.out.println("Enter the Class Name ");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		Object object = Class.forName(className).newInstance();
		System.out.println("Enter the Field Name");
		String fieldName = scanner.next();
		Field field = object.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		Object fieldValue = field.get(object);
		System.out.println(fieldValue);
		System.out.println("Enter the New Value");
		int value = scanner.nextInt();
		field.set(object, value);
		System.out.println("After Change...");
		 fieldValue = field.get(object);
		System.out.println(fieldValue);
		//W obj = new W();
		//Class cls2 = obj.getClass(); // Meta + Data
		
	}

}
