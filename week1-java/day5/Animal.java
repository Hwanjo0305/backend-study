package day5;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name+"이(가) 먹습니다.");
    }

    public void sleep() {
        System.out.println(this.name+"이(가) 잡니다.");
    }

    public void sound() {
        System.out.println("동물 소리");
    }
}
