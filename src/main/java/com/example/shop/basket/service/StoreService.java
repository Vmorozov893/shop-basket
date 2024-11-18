package com.example.shop.basket.service;

import java.util.List;
import java.util.Set;

public interface StoreService {

    Set<Integer> add(List<Integer> basket);

    Set<Integer> get();
}
