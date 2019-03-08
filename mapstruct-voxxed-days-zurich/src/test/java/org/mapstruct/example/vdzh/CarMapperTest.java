package org.mapstruct.example.vdzh;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

/**
 * @author Filip Hrisafov
 */
public class CarMapperTest {

    @Test
    public void mapIntoCarDto() {
        Car car = new Car();
        car.setMake("Mercedes");
        car.setModel(Model.create("GLC"));
        car.setNumberOfSeats(5);
        car.setManufacturingDate(LocalDate.of(2019, Month.MARCH, 19));
        car.setPrice(BigDecimal.valueOf(20_000));
        car.setCategory(Category.SUV);

        CarDto carDto = CarMapper.INSTANCE.map(car);

        assertThat(carDto).isNotNull();
        assertThat(carDto.getMake()).isEqualTo("Mercedes");
//        assertThat(carDto.getModel()).isEqualTo("GLC");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getManufacturingDate()).isEqualTo("19.03.2019");
        assertThat(carDto.getPrice()).isEqualTo(20_000L);
        assertThat(carDto.getCategory()).isEqualTo("SUV");
    }
}
