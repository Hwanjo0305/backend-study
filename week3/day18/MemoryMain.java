package week3.day18;

public class MemoryMain {
    public static void main(String[] args) {
        int number = 10;

        User user1 = new User("윤환");
        User user2 = new User("철수");

        //System.out.println(number);
        System.out.println(user1.name);
        System.out.println(user2.name);
    }
}
