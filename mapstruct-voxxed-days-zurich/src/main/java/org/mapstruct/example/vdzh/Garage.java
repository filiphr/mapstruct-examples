package org.mapstruct.example.vdzh;

import java.util.List;

/**
 * @author Filip Hrisafov
 */
public class Garage {

    private String id;
    private String name;
    private List<Car> cars;

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
