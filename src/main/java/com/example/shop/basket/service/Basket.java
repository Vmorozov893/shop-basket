package com.example.shop.basket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {

    private final Set<Integer> basket = new HashSet<>();

    public Set<Integer> add(List<Integer> basket) {
        this.basket.addAll(basket);
        return get();
    }

    public Set<Integer> get() {
        return Collections.unmodifiableSet(basket);
    }
}
