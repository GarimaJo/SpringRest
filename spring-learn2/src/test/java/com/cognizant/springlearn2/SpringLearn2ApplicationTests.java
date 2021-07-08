package com.cognizant.springlearn2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.cognizant.springlearn2.controller.CountryController;

@SpringBootTest
@AutoConfigureMockMvc
class SpringLearn2ApplicationTests {
	@Autowired
	private MockMvc mvc;

	@Autowired
	private CountryController controller;
	
	//TESTING IF CONTROLLER IS LOADED
	@Test
	void contextLoads() {
		assertNotNull(controller);
	}
	
	//TESTING SERVICE TO GET COUNTRY
	@Test
	void testGetCountry() throws Exception{
		ResultActions actions=mvc.perform(get("/country")); //CALLS SERVICE METHOD
		actions.andExpect(status().isOk()); //CHECK HTTPSTATUS=200
		actions.andExpect(jsonPath("$.code").exists()); //CHECK IF CODE AVAIALABLE IN RESPONSE
		actions.andExpect(jsonPath("$.code").value("IN")); //CHECK IF VALUE OF CODE=IN
		actions.andExpect(jsonPath("$.name").value("India")); //CHECK IF VALUE OF NAME=INDIA
	}

	//TESTING SERVICE FOR EXCEPTIONAL SCENARIO
	@Test
	void testGetCountryException() throws Exception {
		ResultActions actions=mvc.perform(get("/countries/az"));
		actions.andExpect(status().is(404));
		actions.andExpect(status().reason("Country not found"));
	}

}
