package ru.yandex.practicum;

import com.google.gson.Gson;

import java.io.IOException;

class LastLikeInfo {
    // ваш код
}

public class Practicum {

    public static void main(String[] args) throws IOException {
        String lastLikeInfoStr = "{ \"user\": \"Алексей\", \"hours\": 12, \"minutes\": 30}";

        // код для десериализации
				...
        LastLikeInfo lastLikeInfo = ...

        LikesInfo likesInfo = new LikesInfo();
        likesInfo.setRepostsCount(10);
        likesInfo.setHasOwnerLiked(true);
        likesInfo.setLikes(new Like[]{
                new Like("Алексей", "http://example.com/avatars/aleksey.jpg"),
                new Like("Елена", "http://example.com/avatars/elena.jpg"),
                new Like("Света", "http://example.com/avatars/sveta.jpg"),
        });

        likesInfo.setLastLikeInfo(...);

        // код сериализации и вывода на экран
    }
}

class LikesInfo {
    private boolean hasOwnerLiked;
    private Like[] likes;
    private int repostsCount;
    private LastLikeInfo lastLikeInfo;

    public boolean isHasOwnerLiked() {
        return hasOwnerLiked;
    }

    public void setHasOwnerLiked(boolean hasOwnerLiked) {
        this.hasOwnerLiked = hasOwnerLiked;
    }

    public Like[] getLikes() {
        return likes;
    }

    public void setLikes(Like[] likes) {
        this.likes = likes;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public LastLikeInfo getLastLikeInfo() {
        return lastLikeInfo;
    }

    public void setLastLikeInfo(LastLikeInfo info) {
        this.lastLikeInfo = info;
    }
}

class Like {
    private String name;
    private String avatarUrl;

    public Like() {}

    public Like(String name, String avatarUrl) {
        this.name = name;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}