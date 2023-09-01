package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReader {
	
private static Properties config = new Properties();

	
	static {
		
		try {
			File file = new File(".\\src\\test\\resources\\properties\\config.properties");
			FileInputStream fis = new FileInputStream(file);
//			config = new Properties();
			config.load(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return config.getProperty(key);
	}
	

}
