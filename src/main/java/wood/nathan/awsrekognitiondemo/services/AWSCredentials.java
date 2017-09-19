package wood.nathan.awsrekognitiondemo.services;

import com.amazonaws.auth.BasicAWSCredentials;

public class AWSCredentials 
{
	
	private static BasicAWSCredentials theCreds = new BasicAWSCredentials(Constants.ACCESS_KEY, Constants.SECRET_KEY);
	
	public static BasicAWSCredentials getAWSCredentials()
	{
		System.out.println("AWS Access using: " + Constants.ACCESS_KEY + ", "+ Constants.SECRET_KEY);
		
		System.out.println(theCreds);
		
		return theCreds;
	}
	
}
