package day10;

public class GenericMain {
    public static void main(String[] args) {
        Box<String> a = new Box<>();
        a.set("Hello");
        Box<Integer> b = new Box<>();
        b.set(10);

        System.out.println(a.get());
        System.out.println(b.get());
    }
}
