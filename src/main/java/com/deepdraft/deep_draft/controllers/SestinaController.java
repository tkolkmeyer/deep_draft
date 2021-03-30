package com.deepdraft.deep_draft.controllers;


import com.deepdraft.deep_draft.models.Stanza;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sestina")
public class SestinaController {


    @GetMapping("create")
    public String displayEndWordForm(Model model) {
        return "sestina/create";
    }

    @PostMapping("create")
    public String processEndWordForm(Model model, @RequestParam String endword1, @RequestParam String endword2, @RequestParam String endword3, @RequestParam String endword4, @RequestParam String endword5, @RequestParam String endword6) {

        Stanza firstStanza = new Stanza();
        Stanza secondStanza = new Stanza();
        Stanza thirdStanza = new Stanza();
        Stanza fourthStanza = new Stanza();
        Stanza fifthStanza = new Stanza();
        Stanza sixthStanza = new Stanza();

        firstStanza.setStanzaOne(endword1, endword2, endword3, endword4, endword5, endword6);
        secondStanza.setStanzaTwo(endword1, endword2, endword3, endword4, endword5, endword6);
        thirdStanza.setStanzaThree(endword1, endword2, endword3, endword4, endword5, endword6);
        fourthStanza.setStanzaFour(endword1, endword2, endword3, endword4, endword5, endword6);
        fifthStanza.setStanzaFive(endword1, endword2, endword3, endword4, endword5, endword6);
        sixthStanza.setStanzaSix(endword1, endword2, endword3, endword4, endword5, endword6);

        model.addAttribute("stanzaOne", firstStanza.getStanzaOne());
        model.addAttribute("stanzaTwo", secondStanza.getStanzaTwo());
        model.addAttribute("stanzaThree", thirdStanza.getStanzaThree());
        model.addAttribute("stanzaFour", fourthStanza.getStanzaFour());
        model.addAttribute("stanzaFive", fifthStanza.getStanzaFive());
        model.addAttribute("stanzaSix", sixthStanza.getStanzaSix());

        //passing endwords to view as separate variables for the envoi

        model.addAttribute("END1", endword1);
        model.addAttribute("END2", endword2);
        model.addAttribute("END3", endword3);
        model.addAttribute("END4", endword4);
        model.addAttribute("END5", endword5);
        model.addAttribute("END6", endword6);

        return "sestina/create";
    }
}