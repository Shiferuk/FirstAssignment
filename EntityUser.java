public class EntityUser {
    protected int ID;
    protected String name;
    protected static int counter = 1;

    public EntityUser(String name){
        this.ID = counter++;
        this.name = name;
    }

    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Username: " + name + " | ID: " + ID;
    }
}
