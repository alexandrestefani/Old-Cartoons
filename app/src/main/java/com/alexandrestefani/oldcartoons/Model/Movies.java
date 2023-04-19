package com.alexandrestefani.oldcartoons.Model;

public class Movies {
    private String movie_year;
    private String movie_title;
    private String movie_text;
    private int movie_picture;

    public Movies() {
    }

    public Movies(String movie_year, String movie_title, String movie_text, int movie_picture) {
        this.movie_year = movie_year;
        this.movie_title = movie_title;
        this.movie_text = movie_text;
        this.movie_picture = movie_picture;
    }

    public String getMovie_year() {
        return movie_year;
    }

    public void setMovie_year(String movie_year) {
        this.movie_year = movie_year;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_text() {
        return movie_text;
    }

    public void setMovie_text(String movie_text) {
        this.movie_text = movie_text;
    }

    public int getMovie_picture() {
        return movie_picture;
    }

    public void setMovie_picture(int movie_picture) {
        this.movie_picture = movie_picture;
    }
}
