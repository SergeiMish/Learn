package ru.yandex.practicum;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }
    @Override
    // доступ к созданию новых конструкторов запрещён
    public void activateModule(){
        turnSolarPanels();
    }
    // разрешено переопределение методов
}