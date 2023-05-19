package com.example.sweetshop.controllers;

import com.example.sweetshop.services.CakeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CakeController {
    private final CakeService cakeService;

    @GetMapping("/")
    public String cakes(Model model){
        model.addAttribute("cakes", cakeService.listCakes());
        return "index";
    }
}
