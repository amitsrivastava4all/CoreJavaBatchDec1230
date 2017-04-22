import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF = -1;
		String path = "/Users/amit/Documents/JavaBatch1230WS/FileHandlingDemo/src/FileReadDemo.java";
		File file = new File(path);
		if(file.exists()){
		FileInputStream fi = new FileInputStream(file);
		int singleByte = fi.read(); // single byte read
		while(singleByte!=EOF){
			System.out.print(singleByte);
			singleByte = fi.read(); // give current and move to next
		}
		fi.close();
		}

	}

}
