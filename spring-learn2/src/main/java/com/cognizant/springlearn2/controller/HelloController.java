package com.cognizant.springlearn2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello()
	{
		LOGGER.info("START");
		LOGGER.info("END");
		return "Hello World!!";
	}

}
