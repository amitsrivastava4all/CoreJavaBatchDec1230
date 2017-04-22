import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	private String name;
	private double salary;
	private double bonus;
	private double PF ;
	private transient String password;
	Employee(int id, String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password = "A"+id + name.length();
		this.bonus = 1000.0;
		this.PF = 2000;
		System.out.println("Cons Call");
	}
	@Override
	public String toString(){
		return "Id "+id+" name "+name+" Salary "+salary+" Password "+password+" Bonus "+bonus+" PF "+PF;
	}
}
public class ObjectReadWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FileHandlingTesting/TestObjectFileHandling/emp.dat";
		Employee ram = new Employee(1001, "Ram", 9999);
		
		FileOutputStream fs = new FileOutputStream(path,false);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);  // Serialization (Object convert into Bytes) + then Write in File by USing FileOutputStream
		os.close();
		fs.close();
		System.out.println("Done...");
		
	}

}
