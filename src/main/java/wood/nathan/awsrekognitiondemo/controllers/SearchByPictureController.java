package wood.nathan.awsrekognitiondemo.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.amazonaws.services.rekognition.model.FaceMatch;

import wood.nathan.awsrekognitiondemo.services.ImageUtils;
import wood.nathan.awsrekognitiondemo.services.Rekog;

@Controller
public class SearchByPictureController 
{
	Rekog rekogService = new Rekog();
	
	@RequestMapping(value = "/searchByPicture", method = RequestMethod.GET)
	public String handleGet()
	{
		return "searchByImage.html";
	}
	
	
	@RequestMapping(value="/searchByPicture", method = RequestMethod.POST)
	public String handlePost(@RequestParam String savedImage) throws UnsupportedEncodingException
	{
		boolean result = false;
		
		List<FaceMatch> res = rekogService.searchByFace(ImageUtils.convertUploadedImage(savedImage));
		System.out.println("" + res.toString());
		result = true;
		return "redirect:/searchByImage.html?rekogResult=" + result;
	}

}
