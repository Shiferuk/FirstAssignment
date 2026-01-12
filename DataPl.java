/*import java.util.*;
    public List<Cinema> getCinemas() {
        return cinemas;
    }
    public List<Film> getFilms() {
        return films;
    }

    public Cinema findCinemaByID(int id){
        for (Cinema c : getCinemas()){
            if (c.getID() == id){
                return c;
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
    }*/

