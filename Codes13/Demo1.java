import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * String is  a predefine Java Class (java.lang.String)
		 * String Internally as a  char []
		 * String is a final class 
		 * String has a String Pool
		 * String Object creation 2 ways 
		 * a) Literal e.g String name = "Amit";
		 * b) Object way e.g. String name = new String("Amit");
		 * String objects are Immutable
		 */
		// Check Pool
		String a = "ram";
		String  b = "ram";
		if(a==b){
			System.out.println("Sharing the same object...");
		}
		else
		{
			System.out.println("both have different memory");
		}
		// Check Immutable
		a="ramok";
		System.out.println("After Change "+a+" and "+b);
		String name = "Amit".intern();
		String name2="Amit";
		String name3= new String("Amit").intern();
		if(name==name3){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		
		
		// String Methods
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		if(name==name.toUpperCase()){
			System.out.println("SAME REF");
		}
		else
		{
			System.out.println("NOT SAME");
		}
		System.out.println(name.charAt(0));
		System.out.println("Hello".indexOf("l")); //-1 Not found
		System.out.println("Hello".lastIndexOf("l"));
		System.out.println("Mr Ram".startsWith("Mr"));
		System.out.println("Mr Shyam Kumar".endsWith("Kumar"));
		String t = null;
		if("Hello".equals(t)){
		//if(t.equals("Hello")){
			System.out.println("Same Strings");
		}
		else
		{
			System.out.println("Not Same Strings.");
		}
		if("HELLO".equalsIgnoreCase(t)){
			
		}
		System.out.println("amit".compareTo("anil"));
		System.out.println("anil".compareTo("amit"));
		System.out.println("amit".compareTo("amit"));
		System.out.println("It's my Life".startsWith("It's my Life"));
		
		String msg = "Hello";
		String msg2 = new String("Hello");
		if(msg.length()==msg2.length()){
			if(msg.startsWith(msg2)){
				System.out.println("Same.....");
			}
		}
		
		String temp = "             Hello        Java       ";
		System.out.println("["+temp+"]");
		System.out.println("["+temp.trim()+"]");
		boolean yy = msg.contains("How");
		System.out.println("Hello".substring(1));
		System.out.println("Hello".substring(2, 5));
		String bbb = "A-10, Roop Nagar , Delhi -7";
		String arr [] =bbb.split(",");
		System.out.println(arr.length);
		for(String z : arr){
			System.out.println(z);
		}
		int p1 = 1000;
		String hhh = String.valueOf(p1);
		char w[] = "Hello how are you".toCharArray();
		
		Arrays.sort(w);
		String y1 = new String(w);
		System.out.println(y1);
		

	}

}
