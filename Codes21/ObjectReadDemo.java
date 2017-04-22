import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FileHandlingTesting/TestObjectFileHandling/emp.dat";
		FileInputStream fs= new 	FileInputStream(path);
		ObjectInputStream os = new ObjectInputStream(fs);
		Employee emp = (Employee)os.readObject();
		System.out.println(emp);
		os.close();
		fs.close();

	}

}
