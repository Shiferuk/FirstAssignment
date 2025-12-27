public class Main {
    public static void main(String[] array){
        DataPool dataPool = new DataPool();
        dataPool.addFilm(new Film(1, "Brothers", 105, "psychological-drama", 2000));
        dataPool.addFilm(new Film(2, "Zootopia 2", 108,"Cartoon", 1800));
        dataPool.addFilm(new Film(3, "Five Nights at Fredy 2", 104, "Horror", 2700));
        dataPool.addFilm(new Film(4, "Toy Story", 81,"Cartoon", 1600));
        dataPool.addFilm(new Film(5, "Up", 96,"Cartoon", 1600));
        dataPool.addFilm(new Film(6, "The Exorcist", 122, "Horror", 2800));
        dataPool.addFilm(new Film(7, "Matrix", 136, "Science fiction", 3000));
        dataPool.addFilm(new Film(8, "Inception", 148, "Science fiction", 2900));
        dataPool.addFilm(new Film(9, "Avatar", 162, "Fantastic", 2500));
        dataPool.addFilm(new Film(10, "Predator: Badlands", 107, "Fantastic", 2300));

        dataPool.addCinema(new Cinema(1, "Chaplin Mega Silk Way", "ave. Kabanbay Batyr 62"));
        dataPool.addCinema(new Cinema(2, "Kinopark 7 IMAX Keruen", "Dostyk Street 9"));
        dataPool.addCinema(new Cinema(3, "Eurasia Cinema", "Kuyshi Dina St. 4"));

        dataPool.addUser(new User(1, "Ernur", 20));
        dataPool.addUser(new User(2, "John", 35));
        dataPool.addUser(new User(3, "Aigerym", 18));

       dataPool.getFilms().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
       dataPool.getCinemas().forEach(System.out::println);

        /*System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.findFilmByID(2));
        System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.findCinemaByID(2));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Поиск фильма:");
        System.out.println(dataPool.findFilmByTitle("Brothers")); */
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Поиск по жанру:");
        dataPool.filterFilmByGenre("Science fiction").forEach(System.out::println);

        /*System.out.println("Фильмы дешевле 2222:");
        dataPool.filterFilmsByPrice(2222).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Сортировка по цене:");
        dataPool.sortFilmsByPrice().forEach(System.out::println);*/
    }
}
