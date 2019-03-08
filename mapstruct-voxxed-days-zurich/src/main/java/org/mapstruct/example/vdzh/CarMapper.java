package org.mapstruct.example.vdzh;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Filip Hrisafov
 */
@Mapper
public interface CarMapper {

    @Mapping(target = "manufacturingDate", dateFormat = "dd.MM.yyyy")
    @Mapping(target = "seatCount", source = "numberOfSeats")
    CarDto map(Car car);
}
