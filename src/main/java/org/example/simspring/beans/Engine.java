package org.example.simspring.beans;

import org.springframework.stereotype.Component;


@Component
public class Engine {
    String power;
    String fueltype;

    public void EngineStart(){
        System.out.println("Engine Started.");
    }
//    public String getFueltype() {
//        return fueltype;
//    }
//
//    @Override
//    public String toString() {
//        return "Engine{" +
//                "fueltype='" + fueltype + '\'' +
//                ", power='" + power + '\'' +
//                '}';
//    }
//
//    public Engine() {
//    }
//
//    public Engine(String fueltype, String power) {
//        this.fueltype = fueltype;
//        this.power = power;
//    }
//
//    public void setFueltype(String fueltype) {
//        this.fueltype = fueltype;
//    }
//
//    public String getPower() {
//        return power;
//    }
//
//    public void setPower(String power) {
//        this.power = power;
//    }
}
