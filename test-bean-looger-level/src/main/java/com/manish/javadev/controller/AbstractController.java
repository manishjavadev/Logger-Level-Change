package com.manish.javadev.controller;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AbstractController {
	// Debug=>TRACE=>INFO=>WARN=?ERROR=>FATEL
	Logger logger4j = null;

	@PostConstruct
	public void setLogLevel() {
		logger4j = LogFactory.get();

	}
}
