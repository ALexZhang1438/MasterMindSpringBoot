package com.AlexZhangExamen.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Errores implements ErrorController{
	@RequestMapping("/error")
	  public String handleError() {
		return "error";
		
	}
	
	@Override
	public String getErrorPath() {
		return "/error";
	}
}
