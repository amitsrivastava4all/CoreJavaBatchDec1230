// SAM (Single Abstract Method) Interface 
@FunctionalInterface
interface Calculator{
	int calcuate(int x, int y);
	//int add(int x );
}
// EAGER
// Step -1 Class Create and Interface Implement
class Calc implements Calculator{
	//Step -2 Override the method
	@Override
	public int calcuate(int x , int y ){
		return x + y;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		Calculator z= (x,y)->x-y;
		System.out.println(z.calcuate(20, 10));
		Calculator dd = (x,y)->{
			System.out.println("this is my Lambda Expression Java 8");
			return x + y;
		};
		
//		Calculator d  = new Calculator() {
//			
//			@Override
//			public int calcuate(int x, int y) {
//				// TODO Auto-generated method stub
//				return x*y;
//			}
//		};
		//System.out.println(d.calcuate(1000, 200));
		Calculator e = new Calc();
		// Step - 1 , 2 ,3 (Upcasted)
//		Calculator c = new Calculator(){
//			public void print(){
//				System.out.println("Print Call...");
//			}
//			@Override
//			public int calcuate(int x ,int y){
//				this.print();
//				return  x + y;
//			}
//		};
//		System.out.println(c.calcuate(10, 20));
		// TODO Auto-generated method stub
		// Step -3 Create Object 
//		Calc obj = new Calc();
//		// Step -4 Call Methods
//		System.out.println(obj.calcuate(10, 20));
//		Calc obj2 = new Calc();
//		System.out.println(obj2.calcuate(10, 20));

	}

}
