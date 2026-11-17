package org.example.coffeeMachine.service;

import org.example.coffeeMachine.dto.CoffeeCreateDto;
import org.example.coffeeMachine.dto.CoffeeDto;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {
    List<CoffeeDto> allCoffees();
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create(CoffeeCreateDto dto);
    ///update
}
