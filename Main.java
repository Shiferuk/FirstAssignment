public class Main {
    public static void main(String[] array){
        Film film_1 = new Film("Brothers", "psychological-drama", 105);
        Film film_2 = new Film("Zootopia 2", "Cartoon", 108);
        Film film_3 = new Film("Not Without Hope", "Thriller", 121);
        Film film_4 = new Film("Five Nights at Fredy 2", "Horror", 104);
        Film film_5 = new Film("Predator: Badlands", "Fantastic", 107);
        User user_1 = new User("Ernur", 20);
        User user_2 = new User("Olzhas", 23);
        User user_3 = new User("John", 35);
        User user_4 = new User("Aigerym", 21);
        User user_5 = new User("Merey", 25);
        Cinema cinema_1 = new Cinema("Chaplin Cinema", "Astana", 233);
        Cinema cinema_2 = new Cinema("Kinopark", "Almaty", 121);
        Cinema cinema_3 = new Cinema("Halyk Kinopark 16", "Almaty", 241);
        Cinema cinema_4 = new Cinema("Cinema Park", "Oral", 172);
        Cinema cinema_5 = new Cinema("Kinopark Alem", "Semey", 194);

        film_1.printFilmInfo();
        film_5.printFilmInfo();
        user_2.printUserInfo();
        cinema_3.printCinemaInfo();

        System.out.println("\nComparing first film and fifth film:");
        if (film_1.getTitle().equals(film_5.getTitle()) && film_1.getGenre().equals(film_5.getGenre()) && film_1.get_Film_duration() == film_5.get_Film_duration()){
            System.out.println("They are equal!");
        } else {
            System.out.println("They are different.");
        }
    }
}
