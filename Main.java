import model.CinemaData;
import model.BaseMedia;
import model.FilmMedia;
import model.UserData;
import repository.DataPool;

import java.util.List;

public class Main {
    public static void main(String[] array){
        DataPool repository = new DataPool();
        /*repository.saveCinemaToDatabase(new CinemaData("Chaplin Mega Silk Way", "ave. Kabanbay Batyr 62"));
        repository.saveFilmToDatabase(new FilmMedia("Brothers", 105, "psychological-drama", 2000));
        repository.saveUserToDatabase(new UserData("Silver_Fox", "Артур", "Бернар", 42));*/

        DataPool dataPool = new DataPool();

//        List<FilmMedia> films = dataPool.getAllFilms();
//        for (FilmMedia film : films) {
//            System.out.println(film.getTitle() + " | " + film.getDurationInMinutes() + " min | " +
//                            film.getGenre() + " | " + film.getPrice());
//        }
        System.out.println("--------------------------------------------------------------------");
//        FilmMedia film = dataPool.getFilmById(5);
//        System.out.println(film.getTitle() + "|" + film.getDurationInMinutes() + "|" +
//                film.getGenre() + "|" + film.getPrice());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Поиск фильма:");
        FilmMedia film = dataPool.getFilmByTitle("Brothers");
        System.out.println(film.getTitle() + " | " + film.getDurationInMinutes() + " | " +
                film.getGenre() + " | " + film.getPrice());
        /*

        dataPool.getCinemas().forEach(System.out::println);*/

        /*
        System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.findCinemaByID(3));
        System.out.println("--------------------------------------------------------------------");


        System.out.println("--------------------------------------------------------------------");
        System.out.println("Поиск по жанру:");
        dataPool.filterFilmByGenre("Science fiction").forEach(System.out::println);*/

        /*System.out.println(dataPool.findFilmByID(6).equals(dataPool.findFilmByID(5)));
        System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.getFilms().hashCode());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Фильмы дешевле 2222:");
        dataPool.filterFilmsByPrice(2222).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Сортировка по цене:");
        dataPool.sortFilmsByPrice().forEach(System.out::println);*/
    }
}
