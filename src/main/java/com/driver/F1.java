package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, "race", 2, 6, isManual, 1, 2); // Example parameters, adjust as needed
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        // Determine gear based on new speed
        if (newSpeed <= 0) {
            newSpeed = 0;
            super.changeGear(1);
        } else if (newSpeed <= 50) {
            super.changeGear(1);
        } else if (newSpeed <= 100) {
            super.changeGear(2);
        } else if (newSpeed <= 150) {
            super.changeGear(3);
        } else if (newSpeed <= 200) {
            super.changeGear(4);
        } else if (newSpeed <= 250) {
            super.changeGear(5);
        } else {
            super.changeGear(6);
        }

        // Move the car with the new speed and current direction
        if (newSpeed > 0) {
            super.changeSpeed(newSpeed, getCurrentDirection());
        } else {
            super.stop(); // Stop the car if the speed is 0 or less
        }
    }
}
