package ru.sergeimish.springapptest2;

public class Computer {
    private int id = 1;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer){
        this.id = id;
        this.musicPlayer = musicPlayer;

    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
