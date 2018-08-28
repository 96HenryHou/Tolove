package com.StrongWind.ToLove.controller;

import com.StrongWind.ToLove.service.TestTimeService;
import com.StrongWind.ToLove.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    public TestTimeService timeService;
    @RequestMapping(value="*/test")
    public ModelAndView test(){
        System.out.println("@@@@@@@@@@@");
        System.out.println("!!!!!!!");
        timeService.testTime();
        Map<String,Object> tClaimsMap = new HashMap<String,Object>();
        tClaimsMap.put("uid","1111");
        TokenUtil.generateToken(tClaimsMap);
        return new ModelAndView("success.html");
    }
}
