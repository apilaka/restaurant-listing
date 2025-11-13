package com.pilaka.restaurant_listing.service;

import com.pilaka.restaurant_listing.dto.RestaurantDTO;
import com.pilaka.restaurant_listing.entity.Restaurant;
import com.pilaka.restaurant_listing.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> findAllRestaurants(){
       return restaurantRepo.findAll().stream().toList();
    }

}
