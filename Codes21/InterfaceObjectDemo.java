interface RR
{
	void print();
}
class GG{
	
}
class QQ implements RR
{
	public void print(){
		System.out.println("QQ Show...");
	}
}
public class InterfaceObjectDemo {
	static void giveObject(RR rr ){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RR obj5 = new RR(){
			public void print(){
				System.out.println("this is print...");
			}
		};
		obj5.print();
		
		RR obj = new QQ();
		giveObject(obj);
		int pp[] = new int[10];
		GG obj2 = new GG();
		System.out.println(obj2);
		System.out.println(pp);
		

	}

}
