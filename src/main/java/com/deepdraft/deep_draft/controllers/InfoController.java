package com.deepdraft.deep_draft.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("info")
public class InfoController {


    @RequestMapping("")
    public String info(Model model) {

        return "info";
    }
}
