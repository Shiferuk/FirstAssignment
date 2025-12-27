public class Film extends EntityFilm {
    private int Film_duration;
    private String genre;
    private int price;

    public Film(String title, int Film_duration, String genre, int price){
        super(title);
        this.Film_duration = Film_duration;
        this.genre = genre;
        this.price = price;
    }

    public int getFilm_duration(){
        return Film_duration;
    }
    public String getGenre(){
        return genre;
    }
    public int getPrice(){
        return price;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setFilm_duration(int Film_duration){
        this.Film_duration = Film_duration;
    }

    @Override
    public String toString(){
        return super.toString() + " | " + Film_duration + "min | Genre: " + genre + " | Price: " + price;
    }
}
