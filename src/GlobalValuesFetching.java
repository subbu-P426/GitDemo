import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesFetching {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     Properties prop= new Properties(); //import java util
     FileInputStream fis = new FileInputStream("C:\\Users\\Subbu\\eclipse-workspaceNew\\JavaPractice\\src\\data.properties");//add exception
	//read file
     
     prop.load(fis);//add exception io  Read mode
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));  //fetch values from data.properties
	
	prop.setProperty("browser", "firefox"); //setting values at run time
	System.out.println(prop.getProperty("browser"));
	
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Subbu\\eclipse-workspaceNew\\JavaPractice\\src\\data.properties");//add exception
	//write in file
	prop.store(fos,null);  //update firefox in data.properties write mode
	}

}
