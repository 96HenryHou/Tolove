package com.StrongWind.ToLove.controller;

import com.StrongWind.ToLove.service.TestTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    public TestTimeService timeService;
    @RequestMapping(value="*/test")
    public ModelAndView test(){
        System.out.println("@@@@@@@@@@@");
        System.out.println("!!!!!!!");
        timeService.testTime();
        return new ModelAndView("success.html");
    }
}
