package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	static Properties prop = new Properties();

	public static String getPropertyByKey(String key) {
		String configPath = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
		try {
			FileInputStream fis = new FileInputStream(configPath);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	public static String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}

}
