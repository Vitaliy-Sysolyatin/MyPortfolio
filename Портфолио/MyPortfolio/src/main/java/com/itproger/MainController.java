package com.itproger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Страница портфолио");
        return "home";
    }

    @GetMapping("/all")
    public String all(Model model) {
        model.addAttribute("title", "Страница портфолио");
        return "all";
    }

    @GetMapping("/spring")
    public String spring(Model model) {
        model.addAttribute("title", "Страница портфолио");
        return "spring";
    }

    @GetMapping("/fx")
    public String fx(Model model) {
        model.addAttribute("title", "Страница портфолио");
        return "fx";
    }

    @GetMapping("/android")
    public String android(Model model) {
        model.addAttribute("title", "Страница портфолио");
        return "android";
    }

}
