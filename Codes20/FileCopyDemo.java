import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Copy Start...");
		FileInputStream fs = new FileInputStream("/Users/amit/Documents/FileHandlingTesting/abcd/B.mp3");
		BufferedInputStream bs = new BufferedInputStream(fs,10000);
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/abcd/CopyB.mp3");
		BufferedOutputStream bo = new BufferedOutputStream(fo,10000);
		long startTime = System.currentTimeMillis();
		int singleByte = bs.read();
		final int EOF = -1;
		while(singleByte != EOF){
			bo.write(singleByte);
			singleByte = bs.read();
		}
		long endTime = System.currentTimeMillis();
		bo.close();
		bs.close();
		fs.close();
		fo.close();
		
		System.out.println("Done... "+(endTime - startTime)+"ms");

	}

}
