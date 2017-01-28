abstract class L
{
	int t;
	L(){
		t = 10;
		System.out.println("LL Cons Call");
	}
	L(int t){
		this.t = t;
	}
}
class RR extends L
{
	RR(){
		//super();
		System.out.println("RR Cons");
	}
}
interface DBConnection{
	int MAX_CONNECTION = 100;
	int MIN_IDLE_CONNECTION = 10;
	boolean open();
	boolean close();
	int add();
	int delete();
	Object[] select();
}
class SomeCommonDBOperations{
	
}
// How to do
class MySQLDB extends SomeCommonDBOperations implements DBConnection{

	@Override
	public boolean open() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] select() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class OracleDB implements DBConnection{

	@Override
	public boolean open() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] select() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
