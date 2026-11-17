package org.example.coffeeMachine.repository;

import org.example.coffeeMachine.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    
}
