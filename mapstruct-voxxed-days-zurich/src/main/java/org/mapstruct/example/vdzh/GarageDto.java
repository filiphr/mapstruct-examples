package org.mapstruct.example.vdzh;

import java.util.List;

/**
 * @author Filip Hrisafov
 */
public class GarageDto {

    private String id;
    private String name;
    private List<CarDto> cars;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
