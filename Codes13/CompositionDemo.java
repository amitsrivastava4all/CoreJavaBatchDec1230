
class MM
{
	// Effective final (Java 1.8) Method Local Inner Class, Anonymous Class vs final
	void print(){
		 int x=100;  // Local Variable (Stack)
		 //x++;
		class Parent{
			
		}
		 class DD extends Parent{
			void show(){
				System.out.println("this is show... "+x);
				//x++;
				
			}
		}
		DD obj = new DD();
		obj.show();
		//x++;
	}
}
// inner v/s nested (static inner class)
class PP
{
	interface LL{
		void show();
	}
	class EE {
		
	}
	class KK extends EE implements LL
	{
			class MM{
				
			}

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
	}
}
class Outer
{
	int x ;
	Outer(){
		x = 100;
		System.out.println("Outer Cons Call");
		//Inner inner = new Inner();  //1st way
		//inner.show();
	}
	class Inner
	{
		int x ;
		Inner(){
			x =200;
			System.out.println("Inner cons call");
		}
		void show(){
			System.out.println( this.x + Outer.this.x); 
			
		}
	}
}
public class CompositionDemo {

	public static void main(String[] args) {
		MM obj = new MM();
		obj.print();
		
		Outer outer = new Outer();
		//outer.x;
		
		//Outer.Inner inner = outer.new Inner();
		//inner.show();
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
		// TODO Auto-generated method stub

	}

}
