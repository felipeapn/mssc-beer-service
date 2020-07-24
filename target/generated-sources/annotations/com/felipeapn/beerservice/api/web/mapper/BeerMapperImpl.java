package com.felipeapn.beerservice.api.web.mapper;

import com.felipeapn.beerservice.api.domain.Beer;
import com.felipeapn.beerservice.api.domain.Beer.BeerBuilder;
import com.felipeapn.beerservice.api.web.model.BeerDto;
import com.felipeapn.beerservice.api.web.model.BeerDto.BeerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-24T23:26:23+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.5 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto BeerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        beerDto.upc( beer.getUpc() );
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        if ( dto.getVersion() != null ) {
            beer.version( dto.getVersion().longValue() );
        }
        beer.createdDate( dateMapper.asTimestamp( dto.getCreatedDate() ) );
        beer.lastModifiedDate( dateMapper.asTimestamp( dto.getLastModifiedDate() ) );
        beer.beerName( dto.getBeerName() );
        beer.upc( dto.getUpc() );
        beer.price( dto.getPrice() );

        return beer.build();
    }
}
