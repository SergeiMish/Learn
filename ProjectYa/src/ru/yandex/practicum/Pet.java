package ru.yandex.practicum;

public abstract class Pet{
    private final String voice;
    public void sleep(){
        System.out.println("Сплю");
    }

    public void play(){
        System.out.println("Играю");
    }


    public Pet(String voice) {
        this.voice = voice;
    }

    public String giveVoice() {
        return voice;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int pawsCount;

}