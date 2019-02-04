package com.oreilly.sacon.library.library.models;

public class BookWithAvailabilityAndRating {
    private Long id;
    private final String name;
    private final String author;
    private final String description;
    private final int rating;
    private final String imagePath;
    private final boolean available;

    public BookWithAvailabilityAndRating(Long id, String name, String author, String description, int rating, String imagePath, boolean available) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.rating = rating;
        this.imagePath = imagePath;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }

    public String getImagePath() {
        return imagePath;
    }

    public boolean isAvailable() {
        return available;
    }

}