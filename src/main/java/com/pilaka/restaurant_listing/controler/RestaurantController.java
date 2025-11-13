package com.pilaka.restaurant_listing.controler;

import com.pilaka.restaurant_listing.dto.RestaurantDTO;
import com.pilaka.restaurant_listing.entity.Restaurant;
import com.pilaka.restaurant_listing.mapper.RestaurantMapper;
import com.pilaka.restaurant_listing.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<RestaurantDTO> listRestaurents(){
        return restaurantService.findAllRestaurants();

    }

    @GetMapping(value ="/listAllRestaurants")
    public ResponseEntity<List<RestaurantDTO>> listAllRestaurents(){
       return new ResponseEntity<>(restaurantService.findAllRestaurants(), HttpStatus.OK);

    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant (@RequestBody RestaurantDTO restaurantDTO){
      return new ResponseEntity<>(  restaurantService.addRestaurantDTOInDB(restaurantDTO), HttpStatus.OK);
    }

    @GetMapping("fetchById/{id}")
    public ResponseEntity<RestaurantDTO> findRestaurantById(Long id){
        return restaurantService.fetchRestaurantById(id);
    }

}
