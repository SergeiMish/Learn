package ru.yandex.practicum;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;


    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Song song = (Song) obj;
    return title.equals(song.title) &&
            artist.equals(song.artist) &&
            songwriter.equals(song.songwriter);
}

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, songwriter);
    }
    // переопределите метод equals(Object)

}