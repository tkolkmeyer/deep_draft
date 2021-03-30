package com.deepdraft.deep_draft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Deep Draft");


        model.addAttribute("sestinaExplanation", "The sestina poetry format is a French tradition that follows a pattern of word repetition. This structure encourages the poet to build a consistent theme or image, and the complicated tradition allows writers to present as obscure academics. But I’m looking to change that last part! \n" +
                "\n" +
                "It’s okay if the following diagram is a little strange or confusing. Play around with the sestina tool at your own pace. You’ll get it! ");

        return "home";
    }

}