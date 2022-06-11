package edu.techmaster.models;

import java.time.LocalDate;

public class Media {
    private int id;
    private String name;
    private String slug;
    private String information;
    private MediaContentKind contentKind;
    private int runtime;
    private LocalDate releaseDate;
    private int view;

    public Media(int id, String name, String slug, String information, MediaContentKind contentKind, int runtime, LocalDate releaseDate, int view) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.information = information;
        this.contentKind = contentKind;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
        this.view = view;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public MediaContentKind getContentKind() {
        return contentKind;
    }

    public void setContentKind(MediaContentKind contentKind) {
        this.contentKind = contentKind;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
