package edu.techmaster.models;

import java.time.LocalDate;

public class Serial extends Media {
    private int chapters;
    private ReleaseStatus releaseStatus;
    public Serial(
            int id,
            String name,
            String slug,
            String information,
            MediaContentKind contentKind,
            int runtime,
            LocalDate releaseDate,
            int view,
            int chapters,
            ReleaseStatus releaseStatus
    ) {
        super(id, name, slug, information, contentKind, runtime, releaseDate, view);
        this.chapters = chapters;
        this.releaseStatus = releaseStatus;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public ReleaseStatus getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(ReleaseStatus releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    @Override
    public String toString() {
        return "Serial: " + this.getName() + " <" + this.getReleaseDate() + ">";
    }
}
