package ru.yandex.practicum;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;
    private int value;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // проверяем рефлексивность
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { // проверяем на неравенство объекту другого класса и на неравенство пустой ссылке
            return false;
        }

        Song other = (Song) obj;

        return value == other.value; // проверяем на правильное сравнение объектов одного класса
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}