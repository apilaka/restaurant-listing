package com.pilaka.restaurant_listing.controler;

import com.pilaka.restaurant_listing.entity.Restaurant;
import com.pilaka.restaurant_listing.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public String sayHello(){
        return "Welcome to pilaka spring boot";
    }
    @GetMapping("/list")
    public List<Restaurant> listRestaurents(){
        return restaurantService.findAllRestaurants();

    }

}
