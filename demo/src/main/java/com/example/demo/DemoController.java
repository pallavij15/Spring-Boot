package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	 @Autowired
	  EmpServiceImpl empServiceImpl;

	@GetMapping("/Greet")
	public String getGreetings() {
		empServiceImpl.displaySuccess();
		return "Finally..... It worked!!!...";
	}
}
