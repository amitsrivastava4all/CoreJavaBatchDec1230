
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x = 100;
		//x = 200;
		// HAS - A RelationShip
		Employee ram =new Employee(1001,"Ram",21,9999);
		ram.setSalary(ram.getSalary()+1000);
		System.out.println("Now Ram New Salary is "+ram.getSalary());
		//ram.salary++;
		//ram = new Employee();
		// Object Creation is Also Called as Instance Creation
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
		
		//ram.takeInput(-1001, "Ram", -21, -9999);
		//ram.id = -1001;
		//ram.name = "Ram";
		//ram.salary=-9999;
		ram.print();
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
		Employee shyam =new Employee(1002,"Shyam",22,8888);
		//shyam.takeInput(1002, "Shyam", 21, 9999);
//		shyam.id =1002;
//		shyam.name="Shyam";
		shyam.print();
//		System.out.println(shyam.id);
//		System.out.println(shyam.name);
//		System.out.println(shyam.salary);
	}

}
