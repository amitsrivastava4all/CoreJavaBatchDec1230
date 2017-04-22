import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DownloaderDemo {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the Name");
//		String name = br.readLine();
		// TODO Auto-generated method stub
		// counters_point_estimate_2
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/downloader/temp.jpg");
		String id = "counters_point_estimate_2";
		String urlStr = "http://www.wallpapersbyte.com/wp-content/uploads/2015/12/Sachin-Tendulkar-Celebrating-2011-Cricket-World-Cup-India-WallpapersByte-com-3840x2400.jpg";
		//System.out.println("Enter the URL");
		//String urlValue = new Scanner(System.in).next();
		StringBuffer sb = new StringBuffer();
		URL url = new URL(urlStr);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		BufferedInputStream bi = new BufferedInputStream(is);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		int singleByte = bi.read();
		//is.read
		System.out.println("Download Start...");
		while(singleByte!=-1){
			bo.write(singleByte);
			//sb.append((char)singleByte);
			//System.out.print((char)singleByte);
			singleByte = bi.read();
			
		}
		bo.close();
		bi.close();
		fo.close();
		is.close();
		System.out.println("Done...");
		
//		System.out.println(sb);
//		String temp = sb.toString();
//		int index = sb.indexOf(id);
//		index = index + id.length() + 2;
//		String value = temp.substring(index, index + 14);
//		System.out.println("OUTPUT "+value);
//		
		
		

	}

}
