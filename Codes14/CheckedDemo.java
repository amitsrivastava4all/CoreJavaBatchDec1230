import java.io.File;
import java.io.IOException;

public class CheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FileHandlingTesting/mytestcases/Test.txt";
		
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			//file = new File(path2);
		}

	}

}
