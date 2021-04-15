package com.deepdraft.deep_draft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("envoi")
public class EnvoiController {

    @RequestMapping("")
    public String envoi(Model model) {
        return "envoi";
    }
}
