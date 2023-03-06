package ru.sergeimish.springapp2;

public class RockMusic implements Music{

    private RockMusic(){}
    public void doMyInit(){
        System.out.println("Im initialization");
    }
    public void doMyDestroy(){
        System.out.println("Im destroy your bean");
    }
    @Override
    public String getSong() {
        return "Highway to hell";
    }
}
