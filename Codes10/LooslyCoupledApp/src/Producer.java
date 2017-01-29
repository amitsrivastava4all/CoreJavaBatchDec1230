
public class Producer implements ShowThings {
	
	@Override
	public void uCanSeeMe(){
		System.out.println("U Can See Me "+add(100,100,200));
	}
	public void uCantSeeMe(){
		System.out.println("U Can't See Me - Cena");
	}
	
	public int add(int x, int y,int z){
		return x + y;
	}

}
