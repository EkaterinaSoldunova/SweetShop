package com.example.sweetshop.services;

import com.example.sweetshop.entities.Basket;
import com.example.sweetshop.entities.Cake;
import com.example.sweetshop.repositories.BasketRepository;
import com.example.sweetshop.repositories.CakeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BasketService {
    private final BasketRepository basketRepository;

    public List<Basket> listBasket() {
        return basketRepository.findAll();
    }

    public void addCakeToBasket(Basket basket) {
        basketRepository.save(basket);
    }

    public void deleteCakeFromBasket(Long id) {
        basketRepository.deleteById(id);
    }
}
