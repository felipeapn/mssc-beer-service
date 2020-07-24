package com.felipeapn.beerservice.api.web.mapper;

import org.mapstruct.Mapper;

import com.felipeapn.beerservice.api.domain.Beer;
import com.felipeapn.beerservice.api.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}