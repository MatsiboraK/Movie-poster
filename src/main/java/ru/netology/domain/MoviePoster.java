package ru.netology.domain;

public class MoviePoster {
    private int id;
    private String movie;
    private String filmGenre;

    public MoviePoster(int id, String movie, String filmGenre) {
        this.id = id;
        this.movie = movie;
        this.filmGenre = filmGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
