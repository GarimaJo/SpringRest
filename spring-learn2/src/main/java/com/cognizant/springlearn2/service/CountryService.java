package com.cognizant.springlearn2.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn2.exception.CountryNotFoundException;
import com.cognizant.springlearn2.model.Country;

@Service
public class CountryService {
	public Country getCountry(String code) throws CountryNotFoundException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> list = context.getBean("countryList",java.util.ArrayList.class);
		for(Country c:list)
		{
			if(c.getCode().equalsIgnoreCase(code))
			{
				return c;
			}
		}
		throw new CountryNotFoundException("Not Found");
	}

}
