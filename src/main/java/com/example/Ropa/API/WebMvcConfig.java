package com.example.Ropa.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebMvcConfig {

    @GetMapping("/Ropas/Buscador")
    public String Buscador() {
        return "buscador";
    }
}
