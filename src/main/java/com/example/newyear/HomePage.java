package com.example.newyear;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    @GetMapping
    public String homePage() {
        return "index";
    }
    @GetMapping("/v1")
    public String v1Page() {
        return "v1";
    }
}
