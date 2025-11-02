package edu.icet.services;

import edu.icet.model.dto.FoodItems;
import edu.icet.model.dto.Order;
import edu.icet.model.entity.FoodItemsEntity;
import edu.icet.model.entity.OrderEntity;
import edu.icet.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    //place order by single food item

    public void addOrder(Order order){
        orderRepository.save( new OrderEntity(
                        order.getId(),
                        order.getDate(),
                        order.getCustomerId(),
                        order.getStatus(),
                        order.getItem_name(),
                        order.getItem_quantity(),
                order.getUnitPrice(),
                order.getTotal()
                )
        );
    }


    public Order getId(String id){
        Optional<OrderEntity> byId = orderRepository.findById(id);
        OrderEntity orderEntity = byId.get();

        return  new Order(
                orderEntity.getId(),
                orderEntity.getDate(),
                orderEntity.getCustomerId(),
                orderEntity.getStatus(),
                orderEntity.getItem_name(),
                orderEntity.getItem_quantity(),
                orderEntity.getUnitPrice(),
                orderEntity.getTotal()

        );

    }
}
