
public class StringBufferDemo {

	public static void main(String[] args) {
		/*
		 * Immutable - StringBuffer is Mutable
		 * NO StringBuffer Pool	
		 */
		//StringBuilder sb = new StringBuilder(); // Java 1.5 and Not Synchronized
		StringBuffer sb = new StringBuffer();  // Legacy Class and All methods are synchronized
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		String temp = sb.toString();
		
		sb.append("fnsfkghfhgjdgjhdfjkhdfknsdfjsfjsljfklsjfkjsklfjskljfskljfksjflkjsjlkjslk ");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(1, "Hi");
		sb.append("OK");
		sb.deleteCharAt(0);  //single char delete
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.delete(2, 5);  // index, position (Multi char delete)
		sb2.reverse();
		System.out.println("SB2 "+sb2);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hi");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.replace(1, 5, "Hello");
		
		
		// new capacity = old capacity * 2 + 2
		// 20 * 2 + 2
	
			

	}

}
