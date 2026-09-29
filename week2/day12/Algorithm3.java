package day12;
import java.util.HashMap;
import java.util.Map;

public class Algorithm3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,2,4,1,2,3,5};
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(count.containsKey(numbers[i])) {
                int temp = count.get(numbers[i]);
                count.put(numbers[i],temp+1);
            } else {
                count.put(numbers[i],1);
            }
        }
        System.out.println(count);
    }
}
