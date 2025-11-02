package edu.icet.controller;


import edu.icet.model.dto.FoodItems;
import edu.icet.services.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fooditems")
@RestController
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @PostMapping("/addFoodItem")
    public void add(@RequestBody FoodItems foodItems){
foodItemService.add(foodItems);
    }

    @GetMapping("/availableFoodItems")
    public List<FoodItems> availableItems(){
        return foodItemService.getAll();
    }
}
