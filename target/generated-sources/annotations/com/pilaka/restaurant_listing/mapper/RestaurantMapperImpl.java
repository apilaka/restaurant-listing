package com.pilaka.restaurant_listing.mapper;

import com.pilaka.restaurant_listing.dto.RestaurantDTO;
import com.pilaka.restaurant_listing.entity.Restaurant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-23T20:25:59-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (OpenLogic)"
)
@Component
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO) {
        if ( restaurantDTO == null ) {
            return null;
        }

        Restaurant restaurant = new Restaurant();

        restaurant.setId( restaurantDTO.getId() );
        restaurant.setName( restaurantDTO.getName() );
        restaurant.setAddress( restaurantDTO.getAddress() );
        restaurant.setCity( restaurantDTO.getCity() );
        restaurant.setRestaurantDescription( restaurantDTO.getRestaurantDescription() );

        return restaurant;
    }

    @Override
    public RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant) {
        if ( restaurant == null ) {
            return null;
        }

        RestaurantDTO restaurantDTO = new RestaurantDTO();

        restaurantDTO.setId( restaurant.getId() );
        restaurantDTO.setName( restaurant.getName() );
        restaurantDTO.setAddress( restaurant.getAddress() );
        restaurantDTO.setCity( restaurant.getCity() );
        restaurantDTO.setRestaurantDescription( restaurant.getRestaurantDescription() );

        return restaurantDTO;
    }
}
