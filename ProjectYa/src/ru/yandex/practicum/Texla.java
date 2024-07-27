package ru.yandex.practicum;

class Texla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Texla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
            // исправьте метод для ускорения при автопилоте
        }
    }
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
        else if (speed == maxSpeed){
            maxSpeed = 300;
        }
    }
    @Override
    // переопределите метод для ускорения
    public void brake() {
        if (speed > 0){
            speed -= brakingSpeed;
        }
        else { speed = 0;

        }
        // переопределите метод для торможения
    }
}