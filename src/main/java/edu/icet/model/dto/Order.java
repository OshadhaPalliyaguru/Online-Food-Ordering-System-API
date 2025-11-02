package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String id;
    private LocalDate date ;
    private String customerId;
    private String status;
    private String item_name;
    private String item_quantity;
}
