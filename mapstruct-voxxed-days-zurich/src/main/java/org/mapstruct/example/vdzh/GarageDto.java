package org.mapstruct.example.vdzh;

import java.util.List;

/**
 * @author Filip Hrisafov
 */
public class GarageDto {

    private String garageId;
    private String name;
    private List<CarDto> cars;

    public String getGarageId() {
        return garageId;
    }

    public void setGarageId(String garageId) {
        this.garageId = garageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarDto> getCars() {
        return cars;
    }

    public void setCars(List<CarDto> cars) {
        this.cars = cars;
    }
}
