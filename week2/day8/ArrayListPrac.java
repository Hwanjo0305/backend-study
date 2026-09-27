package day8;
import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        names.add("김철수");
        names.add("이영희");
        names.add("이민수");
        names.add("박지민");
        names.add("최유진");

        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names.size());
        System.out.println(names.contains("김영희"));
    }

}