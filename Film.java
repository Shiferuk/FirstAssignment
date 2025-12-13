public class Film {
    private String title;
    private String genre;
    private int Film_duration;
    public Film(String title, String genre, int Film_duration){
        this.title = title;
        this.genre = genre;
        this.Film_duration = Film_duration;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String getGenre){
        this.genre = genre;
    }
    public int get_Film_duration(){
        return Film_duration;
    }
    public void set_Film_duration(int Film_duration){
        this.Film_duration = Film_duration;
    }
    public void printFilmInfo(){
        System.out.println("Film: " + title + " | Genre: " + genre + " | Duration: " + Film_duration + "min");
    }
}
