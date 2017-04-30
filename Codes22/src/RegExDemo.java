import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[a-zA-Z]{3}[0-9]{3}");
		Matcher m = p.matcher("ab2c123");
		System.out.println(m.find());

	}

}
