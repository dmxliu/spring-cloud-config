package com.cloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigController {
	
	@Value("${config.title}")
	private String title ; 
	
	@RequestMapping("title")
	public String title(){
		return this.title;
	}

}
