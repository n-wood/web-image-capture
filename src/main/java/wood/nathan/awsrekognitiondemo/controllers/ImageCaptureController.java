package wood.nathan.awsrekognitiondemo.controllers;


import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import wood.nathan.awsrekognitiondemo.services.ImageUtils;
import wood.nathan.awsrekognitiondemo.services.Rekog;

@Controller
public class ImageCaptureController 
{
	Rekog rekogService = new Rekog();
	
	@RequestMapping(value = "/camera", method = RequestMethod.GET)
	public String handleGet()
	{
		return "getPicture.html";
	}
	
	@RequestMapping(value="/camera", method = RequestMethod.POST)
	public String handlePost(@RequestParam String fileName, @RequestParam String savedImage) throws UnsupportedEncodingException
	{
		boolean result = false;
		
		
				
		rekogService.indexFaces(ImageUtils.convertUploadedImage(savedImage), fileName);
		result = true;
		System.out.println("called rekog");
		return "redirect:/getPicture.html?rekogResult=" + result;
	}
	

}
