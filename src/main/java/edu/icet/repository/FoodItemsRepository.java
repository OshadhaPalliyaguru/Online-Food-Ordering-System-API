package edu.icet.repository;

import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItemsEntity,String> {
}
