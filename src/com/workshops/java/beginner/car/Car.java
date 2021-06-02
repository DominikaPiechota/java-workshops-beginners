package com.workshops.java.beginner.car;

import com.workshops.java.beginner.car.equipment.Radio;

public class Car {
    private Radio radio;

    public Car(Radio radio) {
        this.radio = radio;
    }

    void turnOn() {
        startEngine();
        //trun on regular car
    }

    private void startEngine() {

    }

    void changGear() {
        //kjhsdkjhsd
        /*Ctrl + Shift + /*/

        /*ljdlsld*/
    }

    public void playMusic() {
        radio.playMusic();
    }
}
