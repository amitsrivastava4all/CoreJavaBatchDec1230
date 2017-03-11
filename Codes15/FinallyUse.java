
public class FinallyUse {
	static void useFinally(){
		int e = 10;
		
//		if(e>0){
//			return ;
//		}
		try
		{
			System.out.println("Inside Try....");
			if(e>0){
				System.exit(0);
			}
//			if(e>0){
//			return ;
//			}
			//int a = 10/0;  // throw new ArithmeticException();
			System.out.println("I will never execute...");
		}
		finally{
			System.out.println("Clean Up Code");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useFinally();
		

	}

}
