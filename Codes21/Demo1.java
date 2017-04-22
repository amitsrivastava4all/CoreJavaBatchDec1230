import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String filename) {
		// TODO Auto-generated method stub
		return filename.endsWith(".html");
	}
	
}
	

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FileHandlingTesting/abcd";
		File file = new File(path);
		//File file = new File(path+"/abcd/xyz/tt/pp");
//		String allFiles[] = file.list();
//		for(String f : allFiles){
//			System.out.println(f);
//		}
		File files[] = file.listFiles(new MyFilter());
		System.out.println("U have "+files.length+" html files");
		int counter = 1;
		for(File f : files){
			f.renameTo(new File(path+"/virus"+counter+".haha"));
			counter++;
//			if(f.isDirectory()){
//				System.out.println("<DIR> "+f.getName() + " "+new Date(f.lastModified()));
//			}
//			else
//			if(f.isFile()){
//				if(f.isHidden()){
//					
//				}
//				if(!f.canWrite()){
//					
//				}
//				//f.delete();
//				f.setWritable(false);
//				System.out.println("<FILE> "+f.getName()+" "+new Date(f.lastModified()));
			}
		}
		//file.mkdirs();
//		File file = new File(path);  // assign the path
//		if(file.exists()){
//			file.delete();
//			System.out.println("File Deleted...");
//		}
//		else
//		{
//			file.createNewFile();
//			System.out.println("File Created...");
//		}

	}


