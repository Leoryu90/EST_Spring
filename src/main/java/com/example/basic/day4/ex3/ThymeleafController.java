package com.example.basic.day4.ex3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "왓더");
        model.addAttribute("name2", "h2태그 적용");
        return "index";
    }
}
