package edu.icet.services;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItems;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemsEntity;
import edu.icet.repository.FoodItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<FoodItems> getAll(){
        List<FoodItemsEntity> all = foodItemsRepository.findAll();
        List<FoodItems> foodItemsList = new ArrayList<>();

        for(FoodItemsEntity foodItemsEntity : all){
            foodItemsList.add(new FoodItems(
                    foodItemsEntity.getId(),
                    foodItemsEntity.getCategory(),
                    foodItemsEntity.getName(),
                    foodItemsEntity.getAvailable_amount()
            ));

        }
        return foodItemsList;
    }

    public FoodItems getId(String id){
        Optional<FoodItemsEntity> byId = foodItemsRepository.findById(id);
        FoodItemsEntity foodItemsEntity = byId.get();

        return new FoodItems(
                foodItemsEntity.getId(),
                foodItemsEntity.getCategory(),
                foodItemsEntity.getName(),
                foodItemsEntity.getAvailable_amount()
        );

    }
}
