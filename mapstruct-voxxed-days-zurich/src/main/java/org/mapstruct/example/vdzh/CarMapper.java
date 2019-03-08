package org.mapstruct.example.vdzh;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Filip Hrisafov
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "manufacturingDate", dateFormat = "dd.MM.yyyy")
    @Mapping(target = "seatCount", source = "numberOfSeats")
    CarDto map(Car car);

    default String toModel(Model model) {
        return model.getName();
    }

}
