package com.asuna.ssm.controller;

import com.asuna.ssm.pojo.User;
import com.asuna.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login")
    public ModelAndView UserLogin(User user){

        ModelAndView modelAndView = new ModelAndView();
        User user1 = userService.checkUser(user);
        if (user1 != null){
            modelAndView.addObject("testScope", user1.getUserName());
            modelAndView.setViewName("index");
        }else {
            modelAndView.addObject("testScope", "µÇÂ¼Ê§°Ü");
            modelAndView.setViewName("login");
        }

        return modelAndView;

//        return "login";
    }

    @RequestMapping(value = "/login1")
    public String UserLogin1(Model model){

        model.addAttribute("testScope","ÑÇË¿ÄÈ");
//        return modelAndView;
        return "login";
    }
}
