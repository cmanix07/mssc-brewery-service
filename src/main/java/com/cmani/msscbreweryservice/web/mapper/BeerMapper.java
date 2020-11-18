package com.cmani.msscbreweryservice.web.mapper;

import com.cmani.msscbreweryservice.domain.Beer;
import com.cmani.msscbreweryservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    public BeerDto BeerToBeerDto(Beer beer);
    public Beer BeerDtoToBeer(BeerDto beerDto);
}
