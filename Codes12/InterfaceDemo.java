interface WW{
	default void show(){
		System.out.println("Defination of Show...");
	}
	void print();
}
interface WW1
{
	public default void show(){
		System.out.println("Another Show...");
	}
}
interface WChild extends WW, WW1{
	@Override
	default void show(){
		WW.super.show();
		WW1.super.show();
	}
//	default void print(){
//		
//	}
}
class WWImpl implements WW, WW1
{
	@Override
	public  void show(){
		WW.super.show();
		WW1.super.show();
	}
	public void print(){
		System.out.println("WWIMpl Show");
	}
}

interface E
{
	void show();
	void print();
}
abstract class EAdapter implements E
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
class EE extends EAdapter{
	public void show(){
		System.out.println("EE Show...");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		

	}

}
