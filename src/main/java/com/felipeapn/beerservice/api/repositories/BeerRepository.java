package com.felipeapn.beerservice.api.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.felipeapn.beerservice.api.domain.Beer;

/**
 * Created by jt on 2019-05-17.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
