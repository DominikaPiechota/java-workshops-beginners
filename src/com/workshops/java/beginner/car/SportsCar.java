package com.workshops.java.beginner.car;

import com.workshops.java.beginner.car.equipment.Radio;

public class SportsCar extends Car implements SportsVehicle, SpeedVehicle{

    public SportsCar() {
        super(new Radio());
    }

    void turnOnExtraSpeedButton() {
        turnOn();
        changGear();
    }

    @Override
    public void changeRacingTire(RacingTire racingTire) {

    }
}
