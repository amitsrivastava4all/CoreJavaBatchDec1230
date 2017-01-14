class Parent
{
	int x=10;
	void print(){
		System.out.println("Parent Print Call");
	}
}
class Child extends Parent
{
	int x=20;
	@Override
	void print(){
		System.out.println("Child Print Call "+this.x);
	}
	Child(int x){
		int z = super.x + this.x + x;
	}
}
public class VariableOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent ref = new Child(30);
		ref.print();
		System.out.println(ref.x);
		//new Child(30).print();

	}

}
