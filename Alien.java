package org.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    @Autowired
    private Laptop lap;
    public Alien(){
        age = 69;
        System.out.println("Object created!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
