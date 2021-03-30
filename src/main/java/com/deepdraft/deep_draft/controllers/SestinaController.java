package com.deepdraft.deep_draft.controllers;


import com.deepdraft.deep_draft.models.EndWord;
import com.deepdraft.deep_draft.models.FormOne;
import com.deepdraft.deep_draft.models.FormTwo;
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

        EndWord EW = new EndWord(endword1, endword2, endword3, endword4, endword5, endword6);

        model.addAttribute("END1", EW.getOne());
        model.addAttribute("END2", EW.getTwo());
        model.addAttribute("END3", EW.getThree());
        model.addAttribute("END4", EW.getFour());
        model.addAttribute("END5", EW.getFive());
        model.addAttribute("END6", EW.getSix());

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

        model.addAttribute("stanzaOne", firstStanza.getStanzaOne());
        model.addAttribute("stanzaTwo", secondStanza.getStanzaTwo());
        model.addAttribute("stanzaThree", thirdStanza.getStanzaThree());
        model.addAttribute("stanzaFour", fourthStanza.getStanzaFour());
        model.addAttribute("stanzaFive", fifthStanza.getStanzaFive());

        return "sestina/create";
    }

    @GetMapping("style")
    public String displaySestina(Model model) {

        return "sestina/style";
    }

    @PostMapping("style")
    public String processSestina(Model model, @RequestParam String S1L1, @RequestParam String S1L2, @RequestParam String S1L3, @RequestParam String S1L4, @RequestParam String S1L5, @RequestParam String S1L6, @RequestParam String S2L1, @RequestParam String S2L2, @RequestParam String S2L3, @RequestParam String S2L4, @RequestParam String S2L5, @RequestParam String S2L6, @RequestParam String S3L1, @RequestParam String S3L2, @RequestParam String S3L3, @RequestParam String S3L4, @RequestParam String S3L5, @RequestParam String S3L6, @RequestParam String S4L1, @RequestParam String S4L2, @RequestParam String S4L3, @RequestParam String S4L4, @RequestParam String S4L5, @RequestParam String S4L6, @RequestParam String S5L1, @RequestParam String S5L2, @RequestParam String S5L3, @RequestParam String S5L4, @RequestParam String S5L5, @RequestParam String S5L6, @RequestParam String S6L1, @RequestParam String S6L2, @RequestParam String S6L3, @RequestParam String S6L4, @RequestParam String S6L5, @RequestParam String S6L6) {

        model.addAttribute("S1L1", S1L1);
        model.addAttribute("S1L2", S1L2);
        model.addAttribute("S1L3", S1L3);
        model.addAttribute("S1L4", S1L4);
        model.addAttribute("S1L5", S1L5);
        model.addAttribute("S1L6", S1L6);

        model.addAttribute("S2L1", S2L1);
        model.addAttribute("S2L2", S2L2);
        model.addAttribute("S2L3", S2L3);
        model.addAttribute("S2L4", S2L4);
        model.addAttribute("S2L5", S2L5);
        model.addAttribute("S2L6", S2L6);

        model.addAttribute("S3L1", S3L1);
        model.addAttribute("S3L2", S3L2);
        model.addAttribute("S3L3", S3L3);
        model.addAttribute("S3L4", S3L4);
        model.addAttribute("S3L5", S3L5);
        model.addAttribute("S3L6", S3L6);

        model.addAttribute("S4L1", S4L1);
        model.addAttribute("S4L2", S4L2);
        model.addAttribute("S4L3", S4L3);
        model.addAttribute("S4L4", S4L4);
        model.addAttribute("S4L5", S4L5);
        model.addAttribute("S4L6", S4L6);

        model.addAttribute("S5L1", S5L1);
        model.addAttribute("S5L2", S5L2);
        model.addAttribute("S5L3", S5L3);
        model.addAttribute("S5L4", S5L4);
        model.addAttribute("S5L5", S5L5);
        model.addAttribute("S5L6", S5L6);

        model.addAttribute("S6L1", S6L1);
        model.addAttribute("S6L2", S6L2);
        model.addAttribute("S6L3", S6L3);
        model.addAttribute("S6L4", S6L4);
        model.addAttribute("S6L5", S6L5);
        model.addAttribute("S6L6", S6L6);

        return "sestina/style";
    }



//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public String method1(Model model, @ModelAttribute("command1") FormOne form1){
//
//
//        model.addAttribute("END1", form1.getEND1());
//
//        return "sestina/create";
//    }


//    @RequestMapping(value = "/style", method = RequestMethod.GET)
//    public String method2(Model model, @ModelAttribute("command2") FormTwo form2) {
//
//        model.addAttribute("lineOne", form2.getL1());
//
//        model.addAttribute("lineTwo", form2.getL2());
//
//        return "sestina/style";
//    }


    
}