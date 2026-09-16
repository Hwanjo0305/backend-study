package day5;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name+"이(가) 멍멍 짖습니다.");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
