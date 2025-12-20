public class Cinema {
    private String name;
    private Film film;
    private String location;
    private int availableSeats;
    public Cinema(String name, String location, Film film, int availableSeats){
        this.name = name;
        this.film = film;
        this.location = location;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

    public void setAvailableSeats(int seats){
        if (seats >= 0){
            this.availableSeats = seats;
        }
    }

    public double reverseTicket(User user){
        if (availableSeats <= 0){
            System.out.println("No seats available!");
            return 0;
        }
        availableSeats--;
        double discount = user.discountStudent();
        double final_price = film.getprice() * (1 - discount);
        return final_price;
    }



    public void printCinemaInfo(){
        System.out.println("Cinema: " + name + " | Location: " + location + " | Film: " + film.getTitle() + " | Seats: " + availableSeats);
    }
}
