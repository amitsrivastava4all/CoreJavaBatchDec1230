class Account{
	
	@Deprecated
	/**
	 * @see the new version is in now SavingAccount class
	 */
	void deposit(){
		System.out.println("Account Deposit Call");
	}
	void checkBalance(){
		System.out.println("Account Check Balance");
	}
}
// What is Overriding?
/*
 * When Parent Feature is Outdated , then Child will override
 * the parent feature
 * Rule
 * 1. Must be Inheritance
 * 2. Signature must be same as Parent
 * 3. It will hide the parent defination
 * 4. Overriding calling is depend on Object creation 
 */
class SavingAccount extends Account{
	@Override
	void deposit(){
		super.deposit();
		//super.checkBalance();
		System.out.println("Show PanCard if Amount is > 50000");
	}
	void roi(){
		System.out.println("Saving Account get the ROI 4%");
	}
}
class CurrentAccount extends Account{
	void roi(){
		System.out.println("Current Account Pay ROI ");
	}
	void odLimit(){
		System.out.println("Current A/C has OD Limit...");
	}
}
class AccountCaller{
	void callMe(Account account){
		
		account.checkBalance();
		account.deposit();
		if(account instanceof SavingAccount){
			SavingAccount sa = (SavingAccount) account; //Downcasting
			sa.roi();
		}
		if(account instanceof CurrentAccount){
			((CurrentAccount)account).roi();
			((CurrentAccount)account).odLimit();
		}
		//account.roi();
		System.out.println("************************");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		
		AccountCaller ac = new AccountCaller();
		ac.callMe(new SavingAccount());
		ac.callMe(new CurrentAccount());
		// TODO Auto-generated method stub
//		Account account = new SavingAccount();  //Upcasting
		// Not Possible SavingAccount sa = new Account();
		//SavingAccount sa = new SavingAccount();
//		account.checkBalance();
//		account.deposit();
//		//sa.roi();
//		System.out.println("***********************");
//		//CurrentAccount ca = new CurrentAccount();
//		account = new CurrentAccount();
//		account.checkBalance();
//		account.deposit();
		//account.odLimit();
		//account.roi();
	}

}
