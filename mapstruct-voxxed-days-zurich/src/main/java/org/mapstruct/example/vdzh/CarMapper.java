package org.mapstruct.example.vdzh;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 * @author Filip Hrisafov
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface CarMapper {

    @Mapping( target = "seatCount", source = "numberOfSeats")
    @Mapping( target = "manufacturingDate", dateFormat = "yyyy.MM.dd")
    @Mapping( target = "model", source = "model.name")
    CarDto map(Car car);
}
