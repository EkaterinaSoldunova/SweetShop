package com.example.sweetshop.controllers;

import com.example.sweetshop.entities.Basket;
import com.example.sweetshop.services.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class BasketController {
    private final BasketService basketService;

    @GetMapping("/basket")
    public String basket(Model model){
        model.addAttribute("basket", basketService.listBasket());
        return "basket";
    }

    @PostMapping("/basket/add")
    public String addToBasket(@RequestParam(value = "cakeName") String cakeName, @RequestParam(value = "cakePrice") String cakePrice) {
        Basket basket = new Basket();
        basket.setCakeName(cakeName);
        basket.setCakePrice(Integer.parseInt(cakePrice));
        basketService.addCakeToBasket(basket);
        return "redirect:/";
    }

    @PostMapping("/basket/delete/{id}")
    public String deleteFromBasket(@PathVariable Long id) {
        basketService.deleteCakeFromBasket(id);
        return "redirect:/basket";
    }
}
