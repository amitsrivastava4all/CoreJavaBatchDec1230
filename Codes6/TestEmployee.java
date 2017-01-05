import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		ITEmployee employee = new ITEmployee(id, name, salary);
		System.out.println("Enter the DeptName");
		String deptName = scanner.next();
		System.out.println("Enter the Manager Name");
		String managerName = scanner.next();
		employee.setDeptName(deptName);
		employee.setManagerName(managerName);
		String output = employee.printSalarySlip("\n");
		System.out.println(output);
		scanner.close();

	}

}
