package day4;

public class User {
    String name;
    int age;
    String email;

    User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    void introduce() {
        System.out.println("이름: "+this.name);
        System.out.println("나이: "+this.age);
        System.out.println("이메일: "+this.email);
    }
    public static void main(String[] args) {
        User user = new User("윤환", 25, "test@test.com");
        user.introduce();
    }
}
