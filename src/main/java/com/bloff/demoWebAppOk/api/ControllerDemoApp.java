package com.bloff.demoWebAppOk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerDemoApp {
	// test
	@GetMapping("/demo")
	public String sayOk() {
		return "OK";
	}

//	new comment
	public String introduce() {
		return "Hello my name is checker: How to create optimized and effectiv git comments";
	}

	public void test(){
		System.out.println("test");
	}

	public void test2(){
		System.out.println("test2-new text234");
		System.out.println("test2-new line");
		System.out.println("test2-new line no 2");
		System.out.println("test2-new line no 3");
	}
}
