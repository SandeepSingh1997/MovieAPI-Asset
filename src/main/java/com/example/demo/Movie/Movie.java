package com.example.demo.Movie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column(name = "imdb_id")
    private String imdbId;

    @Column(name = "title")
    private String title;

    @Column(name = "runtime")
    private String runtime;

    @Column(name = "plot")
    private String plot;

    @Column(name = "poster_url")
    private String posterUrl;

    @Column(name = "imdb_rating")
    private String imdbRating;

    public Movie(String imdbId, String title, String runtime, String plot, String posterURL, String imdbRating) {
        this.imdbId = imdbId;
        this.title = title;
        this.runtime = runtime;
        this.plot = plot;
        this.posterUrl = posterURL;
        this.imdbRating = imdbRating;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id.equals(movie.id) && imdbId.equals(movie.imdbId) && title.equals(movie.title) && runtime.equals(movie.runtime) && plot.equals(movie.plot) && posterUrl.equals(movie.posterUrl) && imdbRating.equals(movie.imdbRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imdbId, title, runtime, plot, posterUrl, imdbRating);
    }
}
