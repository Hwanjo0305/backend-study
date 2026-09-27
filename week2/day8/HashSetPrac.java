package day8;
import java.util.HashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        HashSet<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("Spring");
        skills.add("Java");
        skills.add("Python");
        skills.add("Spring");

        System.out.println(skills);
        System.out.println(skills.contains("Java"));
        skills.remove("Java");
        System.out.println(skills);
        System.out.println(skills.size());
    }
    
}
