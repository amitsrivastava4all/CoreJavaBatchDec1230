import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;

class DAO{
	Logger logger = Logger.getLogger(DAO.class);
	void dbOperation() throws IOException {
		int connection = 1;
		logger.debug("Inside DAO ..."+connection);
		System.out.println("DB Connection Open...");
		//int p = 100/0;  // throw new ArithmeticException();
		File file = new File("");
		try{
		file.createNewFile();
		
		System.out.println("DB Query Fire....");
		
		}
		finally{
			// clean up code
			System.out.println("DB Connection Close...");
		}
		logger.debug("Outside DAO");
		}
}
class Helper
{
	Logger logger = Logger.getLogger(Helper.class);
	void businessLogic() throws IOException {
		logger.debug("Inside Helper class ");
		System.out.println("Going to Call DAO");
		DAO dao = new DAO();
		dao.dbOperation();
		System.out.println("Get DAO Result ");
		System.out.println("Give it to UI (View)");
		logger.debug("Outside Helper class ");
	}
}
class View
{
	Logger logger = Logger.getLogger(View.class);
	void ui() throws IOException {
		logger.debug("Inside UI");
		System.out.println("UI Call Helper");
		Helper helper = new Helper();
		helper.businessLogic();
		System.out.println("Get Data from Helper");
		System.out.println("Display Data of Helper on UI");
		logger.debug("OutSide UI");
	}
}
public class AppFlow {
	static String printStackTrace(Exception e){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Properties prop = new Properties();
		//prop.load(path);
		//prop.setProperty("log4j.appender.file.File", "e:\\abcd.log")
		Logger logger = Logger.getLogger(AppFlow.class);
		View view = new View();
		//view.ui();
		try{
		view.ui();
		}
		catch(IOException e){
			//logger.error(e);
			System.out.println(e.toString());
			
			//e.printStackTrace(pw);
			logger.error(printStackTrace(e));
			//
			//e.printStackTrace();
			System.out.println("NO Such File Exist , Problem in Path");
			//e.printStackTrace();
		}
	}

}
