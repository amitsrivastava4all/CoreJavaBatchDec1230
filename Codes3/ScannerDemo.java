import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int counter=0;
//		Scanner scanner= new Scanner("Hello How are You");
//		while(scanner.hasNext()){
//			//System.out.println(scanner.next());
//		System.out.println(scanner.nextLine());
//			counter++;
//		}
//		System.out.println("Counter is "+counter);
//		
//		scanner.close();
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Entr the City");
		scanner.nextLine();
		String city = scanner.nextLine();
		System.out.println("Name "+name+" Age "+age+" City "+city);
	}

}
