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
        model.addAttribute("sestinaExplanation", "The sestina poetry format is a French tradition that follows a pattern of word repetition. This structure encourages the poet to build a consistent theme or image, and the complicated tradition allows writers to present as obscure academics. But I’m looking to change that last part! \n" +
                "\n" +
                "It’s okay if the following diagram is a little strange or confusing. Play around with the sestina tool at your own pace. You’ll get it! ");
        return "sestina/end_word";
    }

//    @PostMapping("end_word")
//    public String processEndWordForm(Model model) {
//        model.addAttribute("title", "Sestina Formatter");
//        return "sestina/end_word";
//    }

}
