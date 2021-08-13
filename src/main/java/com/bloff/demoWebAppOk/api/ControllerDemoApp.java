package com.bloff.demoWebAppOk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerDemoApp {
	
	@GetMapping("/demo")
	public String sayOk() {
		return "OK";
	}
}
