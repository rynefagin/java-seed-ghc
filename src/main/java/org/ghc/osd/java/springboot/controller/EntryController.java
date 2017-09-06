package org.ghc.osd.java.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from OpenShift and Spring Boot!";
	}

}