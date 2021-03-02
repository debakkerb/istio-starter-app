package org.bdb.istio.starter.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("version", "0.1");
        return "index";
    }

}
