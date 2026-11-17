package org.example.coffeeMachine.mapper;

import org.example.coffeeMachine.dto.CoffeeCreateDto;
import org.example.coffeeMachine.dto.CoffeeDto;
import org.example.coffeeMachine.entity.Coffee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CoffeeMapper {
    CoffeeDto toDto(Coffee coffee);

    @Mapping(target = "id", ignore = true)
    Coffee toEntity(CoffeeCreateDto dto);
}

