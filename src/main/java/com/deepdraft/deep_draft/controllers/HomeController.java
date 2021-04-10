package com.deepdraft.deep_draft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("welcome", "Welcome to Deep Draft!");
        model.addAttribute("toolExplain", "This is a poetry formatting tool that lets you skip to the fun part. Traditional poetry formats sometimes call for complicated counting and organizing. This tool does that for you.");
        model.addAttribute("learnMore", "If you're interested in learning more about poetry traditions, that info is here, too! This is an open-sourced project that brings creativity to code. Kind of like the cyberflowers project I used to make this logo. There's a whole world of crafty code out there.");
        return "home";
    }

}