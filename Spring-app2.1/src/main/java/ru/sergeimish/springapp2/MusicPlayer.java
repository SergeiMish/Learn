package ru.sergeimish.springapp2;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;
    public int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Now playing " + music.getSong());
        }

        public List<Music> getMusicList () {
            return musicList;
        }

        public void setMusicList (List < Music > musicList) {
            this.musicList = musicList;
        }
    }
}
