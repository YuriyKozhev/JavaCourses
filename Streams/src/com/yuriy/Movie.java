package com.yuriy;

import java.util.Objects;

public class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return likes == movie.likes &&
                Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, likes);
    }
}
