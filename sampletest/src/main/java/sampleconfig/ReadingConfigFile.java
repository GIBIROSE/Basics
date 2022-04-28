package sampleconfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingConfigFile {

	Properties pro;

	public ReadingConfigFile() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);// load complete file

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
			e.printStackTrace();
		}

	}

	public String getApplicationURL() {

		String url = pro.getProperty("baseURL");
		return url;

	}

	public String getUsername() {

		String username = pro.getProperty("username");
		return username;

	}

	public String getPassword() {

		String password = pro.getProperty("password");
		return password;

	}
	
	public String getChromePath() {

		String chromepath = pro.getProperty("chromepath");
		return chromepath;

	}
	
	public String getFireFoxPath() {

		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;

	}
	
	public String getEdgePath() {

		String edgepath = pro.getProperty("edgepath");
		return edgepath;

	}

}
