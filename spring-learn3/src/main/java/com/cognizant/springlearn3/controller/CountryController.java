package com.cognizant.springlearn3.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn3.exception.CountryNotFoundException;
import com.cognizant.springlearn3.model.Country;
import com.cognizant.springlearn3.service.CountryService;


@RestController
public class CountryController {
	@Autowired
	CountryService service;
	
	private static Logger LOGGER = LoggerFactory.getLogger(CountryController.class); 
	
	@PostMapping("/countries")
	public Country addCountry(@RequestBody @Valid Country country)
	{
		LOGGER.info("START");
		LOGGER.info(country.toString());
		/*
		// Create validator factory

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		// Validation is done against the annotations defined in country bean

		Set<ConstraintViolation<Country>> violations = validator.validate(country);

		List<String> errors = new ArrayList<String>();

		// Accumulate all errors in an ArrayList of type String

		for (ConstraintViolation<Country> violation : violations) {

		errors.add(violation.getMessage());
		}

		// Throw exception so that the user of this web service receives appropriate error message

		if (violations.size() > 0) {

		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.toString());

		}
		*/
		LOGGER.info("END");
		return country;
	}

}
