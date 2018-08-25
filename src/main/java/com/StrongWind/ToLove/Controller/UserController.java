package com.StrongWind.ToLove.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping(value="*/test")
	public ModelAndView test(){
		System.out.println("@@@@@@@@@@@");
		System.out.println("!!!!!!!");
		return new ModelAndView("success.html");
	}
}
