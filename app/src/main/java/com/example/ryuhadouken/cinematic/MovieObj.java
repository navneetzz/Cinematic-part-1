package com.example.ryuhadouken.cinematic;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by ryuhadouken on 30/4/16.
 */
public class MovieObj implements Serializable {

    int id;
    String title;
    String year;
    String posterUrl;
    String bgUrl;
    String plot;
    String vote_avg;

    public MovieObj(int i, String t, String y, String v, String p, String mPlot, String bg) {
        this.id = i;
        this.title = t;
        this.plot = mPlot;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        this.year = simpleDateFormat.format(Date.valueOf(y));
        this.posterUrl = p;
        this.vote_avg = v;
        this.bgUrl = bg;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getBackdropUrl() {
        return posterUrl;
    }

    public void setBackdropUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getRating() { return vote_avg; }

    public void setRating(String vote_avg) { this.vote_avg = vote_avg; }

}
