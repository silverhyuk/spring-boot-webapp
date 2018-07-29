package com.cafe24.webapp.welcome.controller;

import com.cafe24.webapp.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @Autowired
    WelcomeService welcomeService;

    @RequestMapping("/welcome")
    public String welcome(Model model) throws Exception {
        welcomeService.selectWelcomeList();
        model.addAttribute("name", "aa");
        model.addAttribute("title", "TITLE");

        return "welcome";
    }
}