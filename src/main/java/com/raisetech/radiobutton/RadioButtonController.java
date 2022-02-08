package com.raisetech.radiobutton;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RadioButtonController {

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/form")
    public String postForm(@RequestParam("programmingLanguage") String programmingLanguage, Model model) {
        model.addAttribute("programmingLanguage", programmingLanguage);
        return "result";
    }
}
