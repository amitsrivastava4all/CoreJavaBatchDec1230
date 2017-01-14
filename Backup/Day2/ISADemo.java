class Account
{
	double balance;
	void checkBalance(){
		System.out.println("Account Balance Check...");
	}
	void deposit(){
		System.out.println("Account Deposit Call");
	}
	void withDraw(){
		System.out.println("Account WithDraw Call");
	}
}

class SavingAccount extends Account
{
	void roi(){
		System.out.println("Saving Account ROI...");
	}
	/*
	 * Overriding - Must be Inheritance
	 * Signature must be same
	 * Why we override
	 * When some feature is coming from the parent and
	 * it is outdated then u override it and create the updated feature
	  Override hide the parent defination
	 */
	@Override
	void withDraw(){
		super.withDraw();
		System.out.println("SA WithDraw Call, Get ROI 4%");
	}
}

class CurrentAccount extends Account
{
	void odLimit(){
		System.out.println("OD Limit in CA");
	}
	@Override
	void deposit(){
		System.out.println("Can Deposit Any Amount...");
	}
}

class FixedDepositAccount extends Account{
	void lockingPeriod(){
		System.out.println("FA Locking Period....");
	}
	@Override
	void checkBalance(){
		System.out.println("Check Only Once and Then Lock it");
	}
}
class AccountCaller{
	// Polymorphic Method
	public void call(Account account){
		account.withDraw();
		account.deposit();
		account.checkBalance();
		if(account instanceof SavingAccount){
		SavingAccount sa = (SavingAccount)account; //Downcasting
		sa.roi();
		
		}
		else
		if(account instanceof CurrentAccount){	
		((CurrentAccount)account).odLimit();	
		}
		else
		if(account instanceof FixedDepositAccount){
			((FixedDepositAccount)account).checkBalance();
		}
		System.out.println("*******************************");
		
		//account.roi();
	}
}
public class ISADemo {

	public static void main(String[] args) {
		AccountCaller ac = new AccountCaller();
		ac.call(new SavingAccount()); //Account sa = new SavingAccount();
		ac.call(new CurrentAccount());
		ac.call(new FixedDepositAccount());
		// TODO Auto-generated method stub
		// Class refVariable = new Class();
		//SavingAccount sa = new SavingAccount();
//		Account sa = new SavingAccount();
//		//ParentClass refVariable = new SubClass(); //Upcasting
//		sa.deposit();
//		sa.withDraw();
//		sa.checkBalance();
//		//sa.roi();
//		System.out.println("************************");
//		CurrentAccount ca = new CurrentAccount();
//		ca.deposit();
//		ca.withDraw();
//		ca.checkBalance();
//		ca.odLimit();
//		System.out.println("************************");
//		FixedDepositAccount fa = new FixedDepositAccount();
//		fa.deposit();
//		fa.withDraw();
//		fa.checkBalance();
//		fa.lockingPeriod();
		
	}

}
