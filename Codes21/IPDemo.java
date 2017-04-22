import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName()+" "+inet.getHostAddress());
		System.out.println("Enter the Host Name ");
		String hostname = new Scanner(System.in).next();
		InetAddress address[] = InetAddress.getAllByName(hostname);
		for(InetAddress add : address){
			System.out.println(add.getHostAddress());
		}

	}

}
