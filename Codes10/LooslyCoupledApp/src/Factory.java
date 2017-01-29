import java.util.ResourceBundle;

public class Factory {
	private Factory(){}
	public static ShowThings getObject(){
		ShowThings st = null;
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("classname");
		try{
			st = (ShowThings)Class.forName(className).newInstance();
		//Object object = Class.forName(className).newInstance(); //Upcasting
		//st = (ShowThings) object; // Downcasting
		}
		catch(Exception e){
			System.out.println(e);
		}
		//ShowThings p = new FasterProducer();
		return st;
	}
}
