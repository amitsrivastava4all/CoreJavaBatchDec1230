
public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ShowThings p = new Producer();
		ShowThings p = Factory.getObject();
		p.uCanSeeMe();
		//p.uCantSeeMe();

	}

}
