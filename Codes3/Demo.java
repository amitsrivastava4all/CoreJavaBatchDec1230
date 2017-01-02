class Customer //extends Object
{
	@Override
	public int hashCode(){
		return 10;
	}
}
public class Demo {//extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer amit = new Customer();
		System.out.println(amit);
		System.out.println(amit.hashCode());
		Customer ram =new Customer();
		System.out.println(ram.hashCode());
		

	}

}
