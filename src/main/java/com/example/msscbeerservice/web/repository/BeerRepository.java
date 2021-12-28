package com.example.msscbeerservice.web.repository;


import com.example.msscbeerservice.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
