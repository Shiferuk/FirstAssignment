public class Film {
    private String title;
    private String genre;
    private int Film_duration;
    private double price;

    public Film(String title, String genre, int Film_duration, double price){
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.Film_duration = Film_duration;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getFilm_duration(){
        return Film_duration;
    }
    public double getprice(){
        return price;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setFilm_duration(int Film_duration){
        this.Film_duration = Film_duration;
    }
    public void setprice(double price){
        this.price = price;
    }

    public void printFilmInfo(){

        System.out.println("Film: " + title + " | Genre: " + genre + " | Duration: " + Film_duration + "min | Price: " + price);
    }
}
