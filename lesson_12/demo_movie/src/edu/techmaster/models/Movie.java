package edu.techmaster.models;

import java.time.LocalDate;

public class Movie extends Media {

    public Movie(int id, String name, String slug, String information, MediaContentKind contentKind, int runtime, LocalDate releaseDate, int view) {
        super(id, name, slug, information, contentKind, runtime, releaseDate, view);
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " <" + this.getReleaseDate() + ">";
    }
}
