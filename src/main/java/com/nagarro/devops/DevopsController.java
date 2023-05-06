package com.nagarro.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping("/devGet")
	public String devGet() {
		return "You are welcome to DevGet";
	}
	
	@GetMapping("/devNumber")
	public String devNumber() {
		return "Your lucky number is 4";
	}

}
