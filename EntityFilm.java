public class EntityFilm {
    protected int ID;
    protected String title;
    protected static int counter = 1;

    public EntityFilm(String title){
        this.ID = counter++;
        this.title = title;
    }

    public int getID(){
        return ID;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "Name: " + title + " (ID = " + ID + ") ";
    }
}
