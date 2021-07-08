package com.cognizant.springlearn.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	private String name;
	private String code;
	public String getName() {
		//LOGGER.info("Inside get name");
		return name;
	}
	public void setName(String name) {
		//LOGGER.info("Inside set name");
		this.name = name;
	}
	public String getCode() {
		//LOGGER.info("Inside get code");
		return code;
	}
	public void setCode(String code) {
		//LOGGER.info("Inside set code");
		this.code = code;
	}
	public Country() {
		//LOGGER.debug("Inside Country Constructor.");
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}
	
}
