package day5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("초코");
        Cat cat = new Cat("나비");

        dog.sound();
        cat.sound();

        Animal animal1 = new Dog("초코");
        Animal animal2 = new Cat("나비");

        animal1.sound();
        animal2.sound();

        //dog.eat();
        //dog.sleep();
        //dog.bark();
    }
}
