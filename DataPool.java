import java.util.*;

public class DataPool {
    private List<Cinema> cinemas = new ArrayList<>();
    private List<Film> films = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    //private Set<Ticket> tickets = new HashSet<>();

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }
    public void addFilm(Film film) {
        films.add(film);
    }
    public void addUser(User user) {
        users.add(user);
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }
    public List<Film> getFilms() {
        return films;
    }

    public Film findFilmByID(int id){
        for (Film f : getFilms()){
            if (f.getID() == id){
                return f;
            }
        }
        return null;
    }
    public Cinema findCinemaByID(int id){
        for (Cinema c : getCinemas()){
            if (c.getID() == id){
                return c;
            }
        }
        return null;
    }

    public Film findFilmByTitle(String title) {
        for (Film film : films) {
            if (film.getTitle().equalsIgnoreCase(title)) {
                return film;
            }
        }
        return null;
    }

    public List<Film> filterFilmByGenre(String NameGenre){
        List<Film> result = new ArrayList<>();
        for (Film film : films){
            if (film.getGenre().equals(NameGenre)){
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> filterFilmsByPrice(int maxPrice) {
        List<Film> result = new ArrayList<>();
        for (Film film : films) {
            if (film.getPrice() <= maxPrice) {
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> sortFilmsByPrice() {
        List<Film> sorted = new ArrayList<>(films);
        sorted.sort(Comparator.comparingDouble(Film::getPrice));
        return sorted;
    }
}
