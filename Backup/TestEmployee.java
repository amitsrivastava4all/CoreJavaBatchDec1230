
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram =new Employee();
		System.out.println(ram.id);
		System.out.println(ram.name);
		System.out.println(ram.salary);
		ram.id = 1001;
		ram.name = "Ram";
		ram.salary=9999;
		System.out.println(ram.id);
		System.out.println(ram.name);
		System.out.println(ram.salary);
	}

}
