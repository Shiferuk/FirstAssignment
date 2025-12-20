public class User {
    private String name;
    private int age;
    private boolean student;

    public User(String name, int age, boolean student){
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public String get_Name(){
        return name;
    }
    public int get_Age(){
        return age;
    }
    public boolean isStudent(){
        return student;
    }

    public void setStudent(boolean student){
        this.student = student;
    }

    public double discountStudent(){
        if (student){
            return 0.2;
        }
        if (age < 12){
            return 0.3;
        }
        return 0.0;
    }

    public void printUserInfo(){
        System.out.println("User: " + name + " | Age: " + age + " | Student: " + student);
    }
}
