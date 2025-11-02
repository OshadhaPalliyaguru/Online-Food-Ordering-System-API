package edu.icet.controller;

import edu.icet.model.dto.FoodItems;
import edu.icet.model.dto.Order;
import edu.icet.repository.OrderRepository;
import edu.icet.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/0rder")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/placeOrder")
    public void add(@RequestBody Order orders){
        orderService.addOrder(orders);
    }

    @GetMapping("get/{getbyid}")
    public Order getId(@PathVariable String getbyid ){
        return orderService.getId(getbyid);
    }
}
