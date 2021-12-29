package com.example.msscbeerservice.web.mapper;

import com.example.msscbeerservice.web.domain.Beer;
import com.example.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
