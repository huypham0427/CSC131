package com.example.simplerestapis.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplerestapis.models.PostRequest;
import com.example.simplerestapis.models.PostResponse;
import com.example.simplerestapis.models.SampleResponse;

@RestController
public class WebController {

	@RequestMapping("/movies")
	public SampleResponse Sample(@RequestParam(value = "name",
	defaultValue = "null") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1927);
		response.setMessage("Your movie is "+name);
		return response;
	}

	@RequestMapping("/movies/categories")
	// ArrayList of Strings
	// ArrayList of Enum
	// a class categoryList for category to store values

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest inputPayload) {
		PostResponse response = new PostResponse();
		response.setId(inputPayload.getId()*100);
		response.setMessage("Hello " + inputPayload.getName());
		response.setExtra("Some text");
		return response;
	}
}