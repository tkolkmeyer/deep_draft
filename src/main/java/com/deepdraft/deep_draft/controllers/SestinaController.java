package com.deepdraft.deep_draft.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("sestina")
public class SestinaController {


    @GetMapping("end_word")
    public String displayEndWordForm(Model model) {
        model.addAttribute("sestinaExplanation", "The sestina poetry format is a French tradition that follows a pattern of word repetition. This structure encourages the poet to build a consistent theme or image, and the complicated tradition allows writers to present as obscure academics. But I’m looking to change that last part! \n" +
                "\n" +
                "It’s okay if the following diagram is a little strange or confusing. Play around with the sestina tool at your own pace. You’ll get it! ");

        return "sestina/end_word";
    }

    @PostMapping("end_word")
    public String processEndWordForm(Model model, @RequestParam String endword1, @RequestParam String endword2, @RequestParam String endword3, @RequestParam String endword4, @RequestParam String endword5, @RequestParam String endword6) {
        model.addAttribute("EW1", endword1);
        model.addAttribute("EW2", endword2);
        model.addAttribute("EW3", endword3);
        model.addAttribute("EW4", endword4);
        model.addAttribute("EW5", endword5);
        model.addAttribute("EW6", endword6);

        return "sestina/end_word";
    }

}
