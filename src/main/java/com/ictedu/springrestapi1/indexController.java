package com.ictedu.springrestapi1;

public class indexController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
