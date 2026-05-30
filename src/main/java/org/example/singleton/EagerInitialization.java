package org.example.singleton;

//1. Eager Initialization
public class EagerInitialization {

    private static EagerInitialization instance  = new EagerInitialization(); //Eager Initalization
    private EagerInitialization(){}

    public static EagerInitialization getInstance()
    {
        return instance;
    }


}
