package com.cafe24.webapp.welcome.controller;

import com.cafe24.webapp.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome/")
public class WelcomeController {
    @Autowired
    WelcomeService welcomeService;

    /**
     * @url localhost/welcome/hello.do
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "hello.do", method = RequestMethod.GET)
    public String welcome(Model model) throws Exception {
        welcomeService.selectWelcomeList();
        model.addAttribute("name", "aa");
        model.addAttribute("title", "TITLE");

        return "welcome";
    }
    /**
     * @url localhost/welcome/content.do
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "content.do", method = RequestMethod.GET)
    public String content(Model model) throws Exception {
        return "content";
    }
}