
public class ReverseAString {
	static void reverse(){
		String name = "mike";
		for(int i = name.length()-1; i>=0; i--){
			System.out.print(name.charAt(i));
		}
	}
	static int length ;
	static void recreverse(String name){
		
		if(length>=0){
			
			System.out.print(name.charAt(length));
			length--;
			recreverse(name);
			
		}
		
//		for(int i = name.length()-1; i>=0; i--){
//			System.out.print(name.charAt(i));
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse();
		String name = "tom";
		length= name.length()-1;
		recreverse(name);
		
	}

}
