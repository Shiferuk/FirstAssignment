package model;

public class UserData {
    private String nickname;
    private String user_name;
    private String user_surname;
    private int age;

    public UserData(String nickname, String user_name, String user_surname, int age){
        this.nickname = nickname;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public String getNickname(){
        return nickname;
    }
    public String getUser_name() { return user_name; }
    public String getUser_surname() { return user_surname; }
    public void setNickname(){
        this.nickname = nickname;
    }
}