package com.deepdraft.deep_draft.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sestina")
public class SestinaController {


    @GetMapping("end_word")
    public String displayEndWordForm(Model model) {
        model.addAttribute("title", "Sestina Formatter");
        return "sestina/end_word";
    }

//    @PostMapping("end_word")
//    public String processEndWordForm(Model model) {
//        model.addAttribute("title", "Sestina Formatter");
//        return "sestina/end_word";
//    }

}
