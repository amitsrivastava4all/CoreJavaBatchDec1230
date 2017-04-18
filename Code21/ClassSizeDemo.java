import java.lang.instrument.Instrumentation;

class T
{
	
}
class T1
{
	int x;
}
class T2
{
	String w;
}
class T3{
	int e;
	String w;
}
public class ClassSizeDemo {
	public static void premain(String a , Instrumentation ins) {
		System.out.println("Pre Main Call");
		System.out.println("T Size "+ins.getObjectSize(new T()));
		System.out.println("T1 Size "+ins.getObjectSize(new T1()));
		System.out.println("T2 Size "+ins.getObjectSize(new T2()));
		System.out.println("T3 Size "+ins.getObjectSize(new T3()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Call"); 
		
	}

}
