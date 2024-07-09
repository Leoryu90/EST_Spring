package com.example.basic.day4.daily;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DailyController {

    @GetMapping("/daily0709")
    public String daily(Model model) {
        model.addAttribute("daily1", "데일리 태그 1번");
        model.addAttribute("daily2", "데일리 태그 2번");
        model.addAttribute("daily3", "데일리 태그 3번");
        model.addAttribute("daily4", "데일리 태그 4번");
        model.addAttribute("daily5", "데일리 태그 5번");
        return "daily0709";
    }
}
