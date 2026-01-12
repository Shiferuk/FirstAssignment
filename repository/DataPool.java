package repository;

import database.PostgresDBConnection;
import model.BaseMedia;
import model.CinemaData;
import model.FilmMedia;
import model.UserData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataPool {
    public void saveFilmToDatabase(FilmMedia film) {
        String insertFilmSql = "INSERT INTO films " + "(filn_name, film_duration, genre, film_price) " + "VALUES (?, ?, ?, ?)";
        try (Connection connection = PostgresDBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertFilmSql)) {
            preparedStatement.setString(1, film.getTitle());
            preparedStatement.setInt(2, film.getDurationInMinutes());
            preparedStatement.setString(3, film.getGenre());
            preparedStatement.setInt(4, film.getPrice());
            preparedStatement.executeUpdate();
            System.out.println("Film successfully saved to database");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public void saveUserToDatabase(UserData user){
        String insertUserSql = "INSERT INTO users" + "(nickname, user_name, user_surname, age)" + "VALUES (?, ?, ?, ?)";
        try (Connection connection = PostgresDBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertUserSql)){
            preparedStatement.setString(1, user.getNickname());
            preparedStatement.setString(2, user.getUser_name());
            preparedStatement.setString(3, user.getUser_surname());
            preparedStatement.setInt(4, user.getAge());
            preparedStatement.executeUpdate();
            System.out.println("User successfully saved to database");
        }catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public void saveCinemaToDatabase(CinemaData cinema){
        String insertCinemaSql = "INSERT INTO cinemas" + "(name, address)" + "VALUES (?, ?)";
        try (Connection connection = PostgresDBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertCinemaSql)){
            preparedStatement.setString(1, cinema.getName());
            preparedStatement.setString(2, cinema.getAddress());
            preparedStatement.executeUpdate();
            System.out.println("Cinema successfully saved to database");
        }catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public List<FilmMedia> getAllFilms() {
        List<FilmMedia> filmsFromDatabase = new ArrayList<>();
        String selectSql = "SELECT title, film_duration, genre, film_price FROM films";
        try (Connection connection = PostgresDBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(selectSql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                FilmMedia film = new FilmMedia(resultSet.getString("title"),
                        resultSet.getInt("film_duration"),
                        resultSet.getString("genre"),
                        resultSet.getInt("film_price"));
                filmsFromDatabase.add(film);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filmsFromDatabase;
    }

    public FilmMedia getFilmById(int id) {
        String sql = "SELECT * FROM films WHERE film_id = ?";
        try (Connection connection = PostgresDBConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new FilmMedia(rs.getString("title"), rs.getInt("film_duration"),
                        rs.getString("genre"), rs.getInt("film_price")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public FilmMedia getFilmByTitle(String title) {
        String sql = "SELECT * FROM films WHERE title = ?";
        try (Connection connection = PostgresDBConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new FilmMedia(rs.getString("title"), rs.getInt("film_duration"),
                        rs.getString("genre"), rs.getInt("film_price")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
