package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItems {
    private String id;
    private String category;
    private String name;
    private String available_amount;
}
