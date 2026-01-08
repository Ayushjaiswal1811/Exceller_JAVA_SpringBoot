package org.example.simspring.model;

import org.example.simspring.beans.Engine;

public class Car {
    String model;
    String name;
    private Engine Carenginr;

    public Engine getCarenginr() {
        return Carenginr;
    }

    public void setCarenginr(Engine carenginr) {
        Carenginr = carenginr;
    }

    public Car() {
    }

    public Car(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Carenginr=" + Carenginr.toString() +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
