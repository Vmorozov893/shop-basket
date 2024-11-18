package com.example.shop.basket.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StoreServiceImpl implements StoreService {

    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Set<Integer> add(List<Integer> basket) {
        return this.basket.add(basket);
    }

    @Override
    public Set<Integer> get() {
        return this.basket.get();
    }


}
