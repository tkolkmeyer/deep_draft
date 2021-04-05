package com.deepdraft.deep_draft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Deep Draft");

        return "home";
    }

}