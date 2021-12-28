package com.example.msscbeerservice.web.services;

import com.example.msscbeerservice.web.model.BeerDto;
import com.example.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle(BeerStyleEnum.PALE_ALE).build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void deleteBeer(UUID beerId) {

    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        beerDto.setId(beerId);
    }
}
