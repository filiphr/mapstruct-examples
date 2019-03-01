package org.mapstruct.example.vdzh;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Filip Hrisafov
 */
public class CarMapperTest {

    @Test
    public void mapIntoCarDto() {
        Car car = new Car();
        car.setMake("Mercedes");
        car.setNumberOfSeats(5);
        car.setManufacturingDate(LocalDate.of(2019, Month.MARCH, 19));
        car.setPrice(20_000);
        car.setCategory(Category.SUV);

        CarDto carDto = CarMapper.INSTANCE.map(car);

        assertThat(carDto).isNotNull();
        assertThat(carDto.getMake()).isEqualTo("Mercedes");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getManufacturingYear()).isEqualTo("2019");
        assertThat(carDto.getPrice()).isEqualTo(20_000L);
        assertThat(carDto.getCategory()).isEqualTo("SUV");
    }

    @Test
    public void mapIntoCar() {
        CarDto carDto = new CarDto();
        carDto.setMake("Mercedes");
        carDto.setSeatCount(5);
        carDto.setManufacturingYear("2018");
        carDto.setPrice(20_000L);
        carDto.setCategory("SUV");

        Car car = CarMapper.INSTANCE.map(carDto);

        assertThat(car).isNotNull();
        assertThat(car.getMake()).isEqualTo("Mercedes");
        assertThat(car.getNumberOfSeats()).isEqualTo(5);
        assertThat(car.getManufacturingDate()).isEqualTo(LocalDate.now().withYear(2018));
        assertThat(car.getPrice()).isEqualTo(20_000);
        assertThat(car.getCategory()).isEqualTo(Category.SUV);
    }
}
