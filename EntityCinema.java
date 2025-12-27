public class EntityCinema {
    protected int ID;
    protected String name;
    protected static int counter = 1;

    public EntityCinema(String name){
        this.ID = this.counter++;
        this.name = name;
    }

    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + name + " (ID = " + ID + ") ";
    }
}
