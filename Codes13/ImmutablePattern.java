final class MyImmutableClass{
	private final int x;
	private final int y;
	MyImmutableClass(int x, int y){
		this.x = x ;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
public class ImmutablePattern {

	public static void main(String[] args) {
		MyImmutableClass obj = new MyImmutableClass(100, 200);
		MyImmutableClass obj2 = new MyImmutableClass(90, 10);
		// TODO Auto-generated method stub

	}

}
