package com.maximgoodman.pupapp.api;

public class AnimalNotFoundException extends Exception {

    public AnimalNotFoundException(String name){
        super("Animal " + name + " not found");
    }
}
