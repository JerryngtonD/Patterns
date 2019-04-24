package com.patterns.Builder;

public class Example {
    public static void main(String... args) {
        SportCar ultraSpaceRacingCar = new SportCar.Builder("The best ever car")
                .setCompany("Better than Tesla").setVelocity(300000000).build();

        ultraSpaceRacingCar.printConfiguration();
    }
}
