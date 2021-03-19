package org.bdb.istio.starter.frontend.controller;

import org.bdb.istio.starter.frontend.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    private BookRepository bookRepository;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("version", "0.1");
        model.addAttribute("books", bookRepository.getBooks());
        return "index";
    }

}
