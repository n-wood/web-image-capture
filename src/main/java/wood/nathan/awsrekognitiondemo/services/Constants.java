package wood.nathan.awsrekognitiondemo.services;


import java.io.IOException;
import java.util.Properties;

import com.amazonaws.regions.Regions;

public class Constants {
	
		
	
	private static String accessKey;
	private static String secretKey;
	
	static final String COLLECTION = "cwinDemo";
	static final Regions REGION = Regions.EU_WEST_1;
	
	static String ACCESS_KEY = getAccessKey();
	static String SECRET_KEY = getSecretKey();
	
	private static String getAccessKey() 
	{
		if(accessKey==null)
		{
			Properties prop = new Properties();
			try
			{
				prop.load(Constants.class.getClassLoader().getResourceAsStream("aws.properties"));
				accessKey = prop.getProperty("aws.access.key");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		return accessKey;
	}
	private static String getSecretKey() {
		if (secretKey==null)
		{
			Properties prop = new Properties();
			try
			{
				prop.load(Constants.class.getClassLoader().getResourceAsStream("aws.properties"));
				secretKey = prop.getProperty("aws.secret.key");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

		}
		return secretKey;
	}
	
	
	

}
