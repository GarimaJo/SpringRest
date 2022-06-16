package com.cognizant.springlearn2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn2.exception.CountryNotFoundException;
import com.cognizant.springlearn2.model.Country;
import com.cognizant.springlearn2.service.CountryService;

@RestController
public class CountryController {
	private static Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	CountryService service;
	
	//comment
	@RequestMapping(value="/country",method=RequestMethod.GET)
	public Country getCountryIndia()
	{
		LOGGER.info("START: GET COUNTRY INDIA");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("in",Country.class);
		LOGGER.info("END: GET COUNTRY INDIA");
		return country;
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountries()
	{
		LOGGER.info("START: GET ALL COUNTRIES");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> list = context.getBean("countryList",java.util.ArrayList.class);
		LOGGER.info("END: GET ALL COUNTRIES");
		return list;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException
	{
		LOGGER.info("START: GET COUNTRY BY CODE");
		Country country = service.getCountry(code);
		LOGGER.info("END: GET COUNTRY BY CODE");
		return country;
	}
	
}
