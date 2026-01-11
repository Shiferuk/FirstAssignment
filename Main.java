public class Main {
    public static void main(String[] array){
        DataPool dataPool = new DataPool();

        Student student = new Student("Ali", 20);
        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);

        dataPool.addFilm(new Film("Brothers", 105, "psychological-drama", 2000));
        dataPool.addFilm(new Film("Zootopia 2", 108,"Cartoon", 1800));
        dataPool.addFilm(new Film("Five Nights at Fredy 2", 104, "Horror", 2700));
        dataPool.addFilm(new Film("Toy Story", 81,"Cartoon", 1600));
        dataPool.addFilm(new Film("Up", 96,"Cartoon", 1600));
        dataPool.addFilm(new Film("The Exorcist", 122, "Horror", 2800));
        dataPool.addFilm(new Film("Matrix", 136, "Science fiction", 3000));
        dataPool.addFilm(new Film("Inception", 148, "Science fiction", 2900));
        dataPool.addFilm(new Film("Avatar", 162, "Fantastic", 2500));
        dataPool.addFilm(new Film("Predator: Badlands", 107, "Fantastic", 2300));

        dataPool.addCinema(new Cinema("Chaplin Mega Silk Way", "ave. Kabanbay Batyr 62"));
        dataPool.addCinema(new Cinema("Kinopark 7 IMAX Keruen", "Dostyk Street 9"));
        dataPool.addCinema(new Cinema("Eurasia Cinema", "Kuyshi Dina St. 4"));

        dataPool.addUser(new User("Ernur", 20));
        dataPool.addUser(new User("John", 35));
        dataPool.addUser(new User("Aigerym", 18));

        /*dataPool.getFilms().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        dataPool.getCinemas().forEach(System.out::println);*/

        /*System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.findFilmByID(6));
        System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.findCinemaByID(3));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Поиск фильма:");
        System.out.println(dataPool.findFilmByTitle("Brothers"));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Поиск по жанру:");
        dataPool.filterFilmByGenre("Science fiction").forEach(System.out::println);*/

        System.out.println(dataPool.findFilmByID(6).equals(dataPool.findFilmByID(5)));
        System.out.println("--------------------------------------------------------------------");
        System.out.println(dataPool.getFilms().hashCode());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Фильмы дешевле 2222:");
        dataPool.filterFilmsByPrice(2222).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Сортировка по цене:");
        dataPool.sortFilmsByPrice().forEach(System.out::println);
    }
}
