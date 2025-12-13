public class Cinema {
    private String name;
    private String location;
    private int seats;
    public Cinema(String name, String location, int seats){
        this.name = name;
        this.location = location;
        this.seats = seats;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public int getSeats(){
        return seats;
    }
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void printCinemaInfo(){
        System.out.println("Cinema: " + name + " | Location: " + location + " | Total seats: " + seats);
    }
}
