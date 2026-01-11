public class User extends EntityUser {
    private int age;

    public User(String name, int age){
        super(name);
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