class A implements Cloneable
{
	A(){
		System.out.println("A Cons Call");
		
	}
	static{
		System.out.println("I Will Call Only Once...");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class ObjectCreationWays extends Object {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		// 1st Way
		A obj = new A(); // Eager Way
		
		// 2nd Way
		Object object = Class.forName("A").newInstance(); //Lazy Way
		
		// 3rd DeSerialize
		
		//4th Clone
		A obj2 = (A)obj.clone();
		if(obj2==obj){
			System.out.println("Same Ref.");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
