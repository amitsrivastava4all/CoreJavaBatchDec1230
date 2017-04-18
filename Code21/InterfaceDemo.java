

interface E
{
	public void mywait();
	public void mynotify();
}
class MyObject{
	public void mywait(){
		System.out.println("Object Wait...");
	}
	public void mynotify(){
		System.out.println("Object Notify");
	}
}
class B extends MyObject implements E {
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		E e = new B();
		e.mynotify();
		e.mywait();
		
	}

}
