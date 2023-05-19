package com.example.sweetshop.services;

import com.example.sweetshop.entities.Cake;
import com.example.sweetshop.repositories.CakeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CakeService {
    private final CakeRepository cakeRepository;

    public List<Cake> listCakes() {
        return cakeRepository.findAll();
    }
}
