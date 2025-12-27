public class User extends Entity{
    private int age;

    public User(int ID, String name, int age){
        super(ID, name);
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return super.toString() + " Age: " + age;
    }
}