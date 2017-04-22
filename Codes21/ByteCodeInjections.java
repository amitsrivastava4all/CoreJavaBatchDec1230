import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import javassist.NotFoundException;
import java.lang.reflect.Method;

class MyClass
{
	public void show(){
		System.out.println("this is show....");
	}
}
public class ByteCodeInjections {

	public static void main(String[] args) throws NotFoundException, CannotCompileException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, InstantiationException {
		// TODO Auto-generated method stub
		// step - 1 Load the Pool (Perm Space)
		ClassPool pool = ClassPool.getDefault();
		// Step -2 Get the class from Perm Space
		CtClass cc = pool.get("MyClass"); 
		
		// Step -3 Create the Method Dynamically 
		CtMethod m = CtNewMethod.make("public void print() { "
				+ "System.out.println(\"this is Print Call...\"); }", cc);
		   cc.addMethod(m);
		   System.out.println(cc);
		   //cc.writeFile();
		   Class objClass = cc.toClass();
		   //MyClass objClass = new MyClass();
		   Object object = objClass.newInstance();
		   Method method = object.getClass().getDeclaredMethod("print", null);
		//Method method = objClass.getDeclaredMethod("print", null);
		   method.invoke(object, null);
		   System.out.println(objClass);

	}

}
