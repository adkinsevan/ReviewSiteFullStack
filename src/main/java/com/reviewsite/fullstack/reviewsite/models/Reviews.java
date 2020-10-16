package com.reviewsite.fullstack.reviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Objects;

@Entity
public class Reviews {
    @Id
    @GeneratedValue
    private long id;
    @Lob
    private String albumReview;
    @Lob
    private String albumDescription;
    private String albumName;
    private String albumReleaseDate;
    private String genre;
    private String imgUrl;

    protected Reviews(){
    }

    public Reviews(String albumName, String albumDescription, String albumReleaseDate, String genre,
                  String imgUrl, String albumReview) {
        this.albumName = albumName;
        this.albumDescription = albumDescription;
        this.albumReleaseDate = albumReleaseDate;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.albumReview = albumReview;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviews reviews = (Reviews) o;
        return id == reviews.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

