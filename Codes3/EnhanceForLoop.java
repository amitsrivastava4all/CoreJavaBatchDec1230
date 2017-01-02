import java.util.ArrayList;
class Employee{
	int id;
}
//class [I
//       {
//		int length;
//       }
public class EnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w[] = new int[]{10,20,30,40,50,60,70,90};
		Employee e = new Employee();
		System.out.println(e.id);
		int z[] = new int[5];
		System.out.println(z);
		int []y= {10,20,30,40,50};
		int x[] = {1,2,3,4,5};
//		for(int i = 0 ; i<w.length; i++){
//			System.out.println(w[i]);
//		}
		// From Java 1.5 (Enhance For Loop)
		for(int i: w){
			System.out.println(i);
		}
		// From Java 1.8 (ForEach Function )
		// ArrayList(1.4) is a Kind of Dynamic Array in Java
		//ArrayList l = new ArrayList();
		ArrayList<Integer> l = new ArrayList<>(100);
		l.add(100);
		l.add(20);
		int r = l.get(0);
		//l.add("amit");
		//String name = (String)l.get(2);
//		for(Integer j : l){
//			System.out.println(j);
//		}
		l.forEach((myVal)->System.out.println(myVal));
	}

}
