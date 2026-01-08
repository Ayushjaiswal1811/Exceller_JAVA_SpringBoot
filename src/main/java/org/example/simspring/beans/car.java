package org.example.simspring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
    private Engine engine;
    @Autowired
    public car(Engine engine){
        this.engine=engine;
        this.engine.EngineStart();
    }
    public void carStart(){
        System.out.println("Car Started.");
    }
}
