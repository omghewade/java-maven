package com.tap.om.demo;

public class Car {

    private boolean isEngineOn;
    private String model;

    public void car(String model) {
        model = this.model;
        this.isEngineOn = false;
        System.out.println("the model of the car is \t" + model);
    }

    class Engine {

        void start() {
            if (!isEngineOn) {
                System.out.println("start the engine");
                isEngineOn = true;
            } else {

                System.out.println("the engine is alredy on");
            }
        }

        void stop() {
            if (isEngineOn) {
                System.out.println("stop the engine");
                isEngineOn = false;
            } else {

                System.out.println("the engine is alredy stoped");
            }

        }
    }

}
