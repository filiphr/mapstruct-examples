package org.mapstruct.example.vdzh;

import java.time.LocalDate;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * @author Filip Hrisafov
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "manufacturingYear", source = "manufacturingDate", dateFormat = "YYYY")
    @Mapping(target = "seatCount", source = "numberOfSeats")
    CarDto map(Car car);

    @InheritInverseConfiguration
    @Mapping(target = "manufacturingDate", source = "manufacturingYear", qualifiedByName = "currentDayInYear")
    Car map(CarDto carDto);

    @Named("currentDayInYear")
    static LocalDate currentDayInYear(String year) {
        if (year == null) {
            return null;
        }

        return LocalDate.now().withYear(Integer.parseInt(year));
    }
}
