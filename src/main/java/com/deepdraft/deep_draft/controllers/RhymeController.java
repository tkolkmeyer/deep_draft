package com.deepdraft.deep_draft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rhyme")
public class RhymeController {

    @RequestMapping("")
    public String rhyme(Model model) {
        return "rhyme";
    }
}

