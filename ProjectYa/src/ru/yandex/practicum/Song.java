package ru.yandex.practicum;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)

    @Override
    public boolean equals(Object Obj) {
        if (this == Obj) {
            return true;
        }
        if (Obj == null || getClass() != Obj.getClass()) {
            return false;
        } return false;
    }
}