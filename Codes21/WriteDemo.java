import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/abcd/ttt.txt");
		System.out.println("Enter the Text to write in a file...");
		String text = new Scanner(System.in).nextLine();
		fs.write(text.getBytes());
		fs.close();
		System.out.println("Done..");
	}

}
