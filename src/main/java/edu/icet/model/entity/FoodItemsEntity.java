package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class FoodItemsEntity {
    @Id
    private String id;
    private String category;
    private String name;
    private int available_amount;
}
