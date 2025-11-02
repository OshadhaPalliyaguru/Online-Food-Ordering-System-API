package edu.icet.services;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItems;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemsEntity;
import edu.icet.repository.FoodItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Autowired
    FoodItemsRepository foodItemsRepository;

    //add food Item
    public void add(FoodItems foodItems){

        foodItemsRepository.save(new FoodItemsEntity(
                foodItems.getId(),
                foodItems.getCategory(),
                foodItems.getName(),
                foodItems.getAvailable_amount()

        ));
    }
}
