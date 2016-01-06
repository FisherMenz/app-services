package com.fishermenz.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public ResponseEntity<String> sayHello() {
		logger.info("============SayHello===========");
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
