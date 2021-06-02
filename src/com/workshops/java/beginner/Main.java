package com.workshops.java.beginner;

import com.workshops.java.beginner.car.Car;
import com.workshops.java.beginner.car.equipment.Radio;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Radio radio = new Radio();
        Car car = new Car(radio);
        car.playMusic();

        /*Student student = new Student();
        student.changeSecondName("Carrot");

        Student student1 = new Student();

        int sum = 4;
        while (sum != 0) {
            sum--;
        }

        System.out.println("Value of sum = " + sum);*/

    }
}
