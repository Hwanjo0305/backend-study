package day11;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        /*List<String> names = List.of("윤환","철수","영희");

        names.forEach(name -> System.out.println(name));
        
        List<Integer> numbers = List.of(10,15,20,25,30,35);
        numbers.stream()
                .filter(number -> number >= 20)
                .forEach(number -> System.out.println(number));
        List<Integer> numbers = List.of(10,20,30,40);

        numbers.stream()
                .map(number -> number * 3)
                .forEach(number -> System.out.println(number));
        */
       List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
       numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(number -> System.out.println(number));
    }
}
