package wood.nathan.awsrekognitiondemo.services;

import java.nio.ByteBuffer;
import java.util.Base64;

public class ImageUtils 
{
	public static ByteBuffer convertUploadedImage(String savedImage)
	{
		savedImage = savedImage.replace("data:image/png;base64", "");
		savedImage = savedImage.replace(" ", "+");
		
		byte[] fileBytes = Base64.getMimeDecoder().decode(savedImage);
		
		return ByteBuffer.wrap(fileBytes);
	}
}
