package model;

public abstract class BaseMedia {
    protected String title;

    public BaseMedia(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    /*@Override
    public String toString(){
        return "Name: " + title + " (ID = " + ID + ") ";
    }*/
}
