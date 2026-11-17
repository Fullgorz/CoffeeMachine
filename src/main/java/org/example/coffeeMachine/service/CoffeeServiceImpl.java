package org.example.coffeeMachine.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.coffeeMachine.dto.CoffeeCreateDto;
import org.example.coffeeMachine.dto.CoffeeDto;
import org.example.coffeeMachine.entity.Coffee;
import org.example.coffeeMachine.mapper.CoffeeMapper;
import org.example.coffeeMachine.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;
    private final CoffeeMapper coffeeMapper;

    @PostConstruct
    void initDB() {
        coffeeRepository.saveAll(List.of(
                        new Coffee("Espresso", 200),
                        new Coffee("Latte mapper", 76),
                        new Coffee("Ristretto", 54)
                )
        );
    }

    @Override
    public List<CoffeeDto> allCoffees() {
        return coffeeRepository.findAll().stream().map(coffeeMapper::toDto).toList();
    }

    @Override
    public Optional<CoffeeDto> oneCoffee(Long id) {
        return coffeeRepository.findById(id).map(coffeeMapper::toDto);
    }

    @Override
    public CoffeeDto create(CoffeeCreateDto dto) {
        Coffee entity = coffeeMapper.toEntity(dto);
        Coffee saved = coffeeRepository.save(entity);
        return coffeeMapper.toDto(saved);
    }
}
