package com.learnspringBoot.learnspringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringBoot.learnspringBoot.course.Course;
import com.learnspringBoot.learnspringBoot.currency.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {
	// bean which is created by Spring for CurrencyServiceConfiguration class is mapped here
	@Autowired 
	public CurrencyServiceConfiguration configure;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourse() {
		return configure;
		
	}

}
