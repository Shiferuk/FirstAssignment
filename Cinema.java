public class Cinema extends EntityCinema {
    private String address;

    public Cinema(String name, String address){
        super(name);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + address;
    }
}