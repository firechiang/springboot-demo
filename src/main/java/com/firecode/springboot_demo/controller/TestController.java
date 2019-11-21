package com.firecode.springboot_demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/host")
	public String host() throws UnknownHostException {
		
		return InetAddress.getLocalHost().getHostAddress();
	}
}
