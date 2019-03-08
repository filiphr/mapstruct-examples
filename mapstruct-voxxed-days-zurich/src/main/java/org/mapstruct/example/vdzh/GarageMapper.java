package org.mapstruct.example.vdzh;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Filip Hrisafov
 */
@Mapper(uses = CarMapper.class)
public interface GarageMapper {

    @Mapping(target = "garageId", source = "id")
    GarageDto map(Garage garage);

}
