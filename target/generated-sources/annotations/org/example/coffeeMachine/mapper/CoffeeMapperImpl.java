package org.example.coffeeMachine.mapper;

import javax.annotation.processing.Generated;
import org.example.coffeeMachine.dto.CoffeeCreateDto;
import org.example.coffeeMachine.dto.CoffeeDto;
import org.example.coffeeMachine.entity.Coffee;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-17T17:20:25+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.13.0.3 (Arch Linux)"
)
@Component
public class CoffeeMapperImpl implements CoffeeMapper {

    @Override
    public CoffeeDto toDto(Coffee coffee) {
        if ( coffee == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        int price = 0;

        id = coffee.getId();
        name = coffee.getName();
        price = coffee.getPrice();

        CoffeeDto coffeeDto = new CoffeeDto( id, name, price );

        return coffeeDto;
    }

    @Override
    public Coffee toEntity(CoffeeCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        Coffee coffee = new Coffee();

        coffee.setName( dto.name() );
        coffee.setPrice( dto.price() );

        return coffee;
    }
}
