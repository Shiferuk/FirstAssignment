public class Main {
    public static void main(String[] array){
        Film film_1 = new Film("Brothers", "psychological-drama", 105, 2500);
        Film film_2 = new Film("Zootopia 2", "Cartoon", 108, 1800);
        Film film_3 = new Film("Not Without Hope", "Thriller", 121, 2700);
        Film film_4 = new Film("Five Nights at Fredy 2", "Horror", 104, 2000);
        Film film_5 = new Film("Predator: Badlands", "Fantastic", 107, 3000);

        User user_1 = new User("Ernur", 20, true);
        User user_2 = new User("Olzhas", 49, false);
        User user_3 = new User("John", 35, false);
        User user_4 = new User("Aigerym", 18, true);
        User user_5 = new User("Merey", 25, false);

        Cinema cinema_1 = new Cinema("Chaplin Cinema", "Astana", film_1, 23);
        Cinema cinema_2 = new Cinema("Kinopark", "Almaty", film_2, 12);
        Cinema cinema_3 = new Cinema("Halyk Kinopark 16", "Almaty", film_3, 41);
        Cinema cinema_4 = new Cinema("Cinema Park", "Oral", film_4, 17);
        Cinema cinema_5 = new Cinema("Kinopark Alem", "Semey", film_5, 1);

        film_1.printFilmInfo();
        film_4.printFilmInfo();

        user_1.printUserInfo();
        user_3.printUserInfo();

        cinema_1.printCinemaInfo();

        double price_1 = cinema_1.reverseTicket(user_1);
        System.out.println("Ticket price for " + user_1.get_Name() + " Tg " + price_1);

        double price_3 = cinema_1.reverseTicket(user_3);
        System.out.println("Ticket price for " + user_3.get_Name() + " Tg " + price_3);

        cinema_1.printCinemaInfo();

        if (film_1.getprice() > film_4.getprice()){
            System.out.println(film_1.getTitle() + " is more expensive than " + film_4.getTitle());
        } else {
            System.out.println(film_4.getTitle() + " is more expensive than " + film_1.getTitle());
        }
    }
}
