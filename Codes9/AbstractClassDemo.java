class TT
{
//	TT(){
//		System.out.println("TT Default Cons Call");
//	}
	TT(int x){
		System.out.println("TT Param Cons Call");
	}
}
class PP extends TT{
	PP()
	{
		super(100);
		// super();
		System.out.println("PP Default Cons Call");
	}
	PP(int x){
		super(100);
		System.out.println("PP Param Cons Call");
	}
}
abstract class Loan
{
	int amount;
	String name;
	int accountNo;
	void loanDisburse(){
		
	}
	abstract void roi(); // Method Declare
}
class HomeLoan extends Loan{

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("Home Loan ROI 10%"); 
		
	}
	
}
class PersonalLoan extends Loan{
	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("Personal Loan ROI 12%"); 
		
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan loan = new Loan();
		PP obj = new PP(10);
	}

}
