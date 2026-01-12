package model;

import database.PostgresDBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class FilmMedia extends BaseMedia{
    private int durationInMinutes;
    private String genre;
    private int price;

    public FilmMedia(String title, int durationInMinutes, String genre, int price) {
        super(title);
        this.durationInMinutes = durationInMinutes;
        this.genre = genre;
        this.price = price;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public String getGenre() {
        return genre;
    }
    public int getPrice() {
        return price;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setdurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }



    @Override
    public String toString(){
        return super.toString() + " | " + durationInMinutes + "min | Genre: " + genre + " | Price: " + price;
    }
    public int hashCode() {
        return title.hashCode();
    }
}
