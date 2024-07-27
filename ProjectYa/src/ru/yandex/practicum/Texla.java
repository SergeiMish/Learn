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
        } else {
            speed = maxSpeed;
        }
    }

    @Override
    // переопределите метод для ускорения
    public void brake() {
        if (speed >= 120) {
            speed -= brakingSpeed;
        } else {
            speed = 0;
        }
    }
}