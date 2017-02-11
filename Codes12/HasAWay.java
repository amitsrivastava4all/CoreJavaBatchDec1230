class Employee{
	Dept d ;
	int id;
	static Employee object;
	Employee(int id){
		this.id = id;
		System.out.println("Employee Cons Call..");
		d = new Dept();
	}
	@Override
	protected void finalize(){
		//object = this;
		System.out.println("Bye Bye Company...."+this.id+" "+this);
	}
	
}
class Dept{
	Dept(){
		System.out.println("Dept Cons Call..."); 
		
	}
	@Override
	protected void finalize(){
		System.out.println("Bye Bye Dept.... "+this);
	}
}
public class HasAWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee(1001);
		ram = null;
		System.gc();
		for(int i = 1; i<=10; i++){
			System.out.println("I am Doing something else.. "+i);
		}
		//ram = Employee.object;
		//System.out.println(ram.id);
	}

}
