package day3;

public class MethodPrac {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println(result);
    }
}

