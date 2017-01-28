import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface K
{
	void show();
	void print();
	void disp();
}
class Adapter implements K{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
class Y extends Adapter
{
	@Override
	public void show(){
		System.out.println("Y Show");
	}
}
public class PartialImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowListener l;
		WindowAdapter w;
	}

}
