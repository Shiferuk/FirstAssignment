package model;

public class CinemaData {
    private String name;
    private String address;
    public CinemaData(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName(){
        this.name = name;
    }
    public void setAddress(){
        this.address = address;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", " + address;
    }
}