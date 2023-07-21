package com.yavor.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("Inside constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Swim a 1000 meters as a warm up";
    }
}
