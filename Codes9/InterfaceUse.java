/*
 * interface - Standard / Model (What to do)
 * 100 % Abstract till Java 7
 * interface = abstract methods + constants
 */
// abstract interface IPlayer
interface IPlayer{
	int MAX_JUMP = 100; //public static final int MAX_JUMP = 100
	int MIN_JUMP = 10;
	void move(); // public abstract void move();
	void jump();	
	void attack();
}
interface IStarPlayer{
	void invisble();
}
class RedPlayerImpl implements IPlayer,IStarPlayer{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move 360d");
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("high Jump");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Kick Attack");
	}

	@Override
	public void invisble() {
		System.out.println("Player Hide...");
		// TODO Auto-generated method stub
		
	}
	
}

interface A{
	int X = 10;
	void print();
	 void show();
}
interface B
{
	int X = 20;
	void print();
}
interface C extends A,B{
	
}

public class InterfaceUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedPlayerImpl player = new RedPlayerImpl();
		player.attack();
		player.move();
		player.jump();
		player.invisble();

	}

}
