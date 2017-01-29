import java.util.Scanner;

class TT
{
	TT(){
		System.out.println("TT Cons Call");
	}
}
class MM{
	MM(){
		System.out.println("MM Cons Call ");
	}
}
public class DynamicObject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter the ClassName ");
		String className = new Scanner(System.in).next();
		Object object = Class.forName(className).newInstance();
//		int choice = 1;
//		if(choice == 1){
//		TT obj = new TT();
//		}
//		else
//		if(choice == 2){	
//			MM obj = new MM();
//		}

	}

}
