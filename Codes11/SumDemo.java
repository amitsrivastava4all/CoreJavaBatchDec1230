import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. For English");
		System.out.println(" हिंदी के लिए 2 दबाएँ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		Locale locale = null;
		if(choice ==1 ){
			locale = new Locale("fr","FR");
		}
		else
		if(choice ==2){
			locale = new Locale("hi","IN");
		}
		ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
		System.out.println(rb.getString("firstnomsg"));
		double firstNo = scanner.nextDouble();
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedNumber = nf.format(firstNo);
		System.out.println(formattedNumber);
		Date date = new Date(); 
		//System.out.println(date);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		String formattedDate = df.format(date);
		System.out.println(formattedDate);
		
		
	}

}
