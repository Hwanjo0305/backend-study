package day3;

public class ArrayMethods {
    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static double getAverage(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double)sum / numbers.length;
    }
    public static void main(String[] args) {
        int[] numbers = {80,90,70,100,85};
        System.out.println("최댓값: " + getMax(numbers));
        System.out.println("최솟값: " + getMin(numbers));
        System.out.println("평균: " + getAverage(numbers));
    }
}
