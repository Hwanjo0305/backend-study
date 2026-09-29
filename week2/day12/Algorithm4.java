package day12;

public class Algorithm4 {
    public static void main(String[] args) {
        int[] numbers = {5,2,8,1,3};
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length-1-i; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k]+" ");
        }
    }
}
