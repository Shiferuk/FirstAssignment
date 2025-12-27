public class Cinema extends Entity{
    private String address;

    public Cinema(int ID, String name, String address){
        super(ID, name);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return super.toString() + "," + address;
    }
}