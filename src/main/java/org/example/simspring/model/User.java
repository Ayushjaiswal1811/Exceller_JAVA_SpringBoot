package org.example.simspring.model;

import org.example.simspring.beans.Engine;
import org.example.simspring.beans.Sim;

public class User {
    String name;
    String address;
    private Sim usersim;
    private Engine userengine;

    public User() {

    }

    public Engine getUserengine() {
        return userengine;
    }

    public void setUserengine(Engine userengine) {
        this.userengine = userengine;
    }

    @Override
    public String toString() {
        return "User{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", usersim=" + usersim.toString() +
                ", userengine=" + userengine +
                '}';
    }

    public User(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sim getUsersim() {
        return usersim;
    }

    public void setUsersim(Sim usersim) {
        this.usersim = usersim;
    }
}
