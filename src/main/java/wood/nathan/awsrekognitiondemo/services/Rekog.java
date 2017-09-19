package wood.nathan.awsrekognitiondemo.services;

import java.nio.ByteBuffer;
import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.FaceMatch;
import com.amazonaws.services.rekognition.model.FaceRecord;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.IndexFacesRequest;
import com.amazonaws.services.rekognition.model.SearchFacesByImageRequest;

public class Rekog 
{
	private AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder
		    .standard()
		    .withRegion(Constants.REGION)
		    .withCredentials(new AWSStaticCredentialsProvider(AWSCredentials.getAWSCredentials()))
		    .build();

	
	public void indexFaces(ByteBuffer file, String fileName )
	{
		 IndexFacesRequest request = new IndexFacesRequest()
			      .withCollectionId(Constants.COLLECTION)
			      .withImage(new Image().withBytes(file))
			      .withExternalImageId(fileName);

		 List<FaceRecord> result = rekognitionClient.indexFaces(request).getFaceRecords();
		 System.out.println(result);
	}
	
	public List<FaceMatch> searchByFace(ByteBuffer file) 
			{
			    
				SearchFacesByImageRequest request = new SearchFacesByImageRequest()
			      .withCollectionId(Constants.COLLECTION)
			      .withImage(new Image().withBytes(file));

			    return rekognitionClient.searchFacesByImage(request).getFaceMatches();
			}

}
