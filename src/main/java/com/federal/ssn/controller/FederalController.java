package com.federal.ssn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FederalController {
	
	@GetMapping(value = "/ssn/{ssnNbr}")
	public String getState(@PathVariable("ssnNbr") String ssnNbr) {
	      if(ssnNbr.equals("6"))	{
	    	  return "New Jersy";
	      }else {
	    	  return "Texas";
	      }
	}

}
