package com.manish.javadev.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messagecontroller")
public class MessagesController extends AbstractController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/test")
	public String home(Locale locale, Model model) {

		logger4j.debug("Welcome home! The client locale is {}." + locale);
		logger4j.debug("Welcome home! The client locale is {}." + locale);

		logger4j.info("Welcome home! The client locale is {}." + locale);
		logger4j.info("Welcome home! The client locale is {}." + locale);

		logger4j.warn("Welcome home! The client locale is {}." + locale);
		logger4j.warn("Welcome home! The client locale is {}." + locale);

		return "home";
	}

}
