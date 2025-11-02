package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class OrderEntity {
    @Id
    private String id;
    private LocalDate date ;
    private String customerId;
    private String status;
    private String item_name;
    private int item_quantity;
    private int unitPrice;
    private int total;
}
