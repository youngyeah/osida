package com.osida.system.controller;

import com.osida.common.controller.BaseController;
import groovy.util.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		System.out.println("...");
		return "login";
	}

}
