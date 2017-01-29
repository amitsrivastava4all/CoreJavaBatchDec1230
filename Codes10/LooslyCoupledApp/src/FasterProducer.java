import javax.xml.ws.handler.soap.SOAPMessageContext;

public class FasterProducer implements ShowThings {

	@Override
	public void uCanSeeMe() {
		System.out.println("This logic is very faster "+multiply(100, 200));
		
	}
	
	public int multiply(int x, int y){
		return x + y;
	}

}
