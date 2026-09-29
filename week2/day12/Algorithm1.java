package day12;

public class Algorithm1 {
    public static void main(String[] args) {
        int[] numbers = {10,35,20,7,50,42};
        int max = 0;
        int secondmax = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                secondmax = max;
                max = numbers[i];
            } else if((numbers[i] > secondmax)&&numbers[i] < max) {
                secondmax = numbers[i];
            }
        }
        System.out.println(secondmax);
    }
}
