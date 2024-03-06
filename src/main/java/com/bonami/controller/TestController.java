package com.bonami.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/api/msg")
	public String getMessage() {
		return "Hello,Good morning";
	}
	@GetMapping("/")
	public String getMessage1() {
		return "Hello,Good morning ==========";
	}
}
