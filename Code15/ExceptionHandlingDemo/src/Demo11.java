
public class Demo11 {
	static Exception test(){
		return new Exception();
	}
	static void test2(){
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception e = test();
		System.out.println(e);

	}

}
