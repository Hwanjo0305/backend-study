package day8;
import java.util.HashMap;

public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1,"윤환");
        users.put(2,"철수");
        users.put(3,"영희");

        System.out.println(users);
        System.out.println(users.get(2));
        System.out.println(users.containsKey(4));
        users.remove(3);
        System.out.println(users);
        System.out.println(users.size());
    }
}
