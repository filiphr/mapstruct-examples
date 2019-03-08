package org.mapstruct.example.vdzh;

import org.mapstruct.Mapper;

/**
 * @author Filip Hrisafov
 */
//@Mapper(uses = CarMapper.class)
public interface GarageMapper {

    GarageDto map(Garage garage);

}
