package org.mapstruct.example.vdzh;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Filip Hrisafov
 */
@Mapper(uses = CarMapper.class, componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GarageMapper {

    GarageDto map(Garage garage);

}
