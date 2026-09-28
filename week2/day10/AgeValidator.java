package day10;

public class AgeValidator {
    public static void validate(int age) throws IllegalArgumentException {
        if(age<0) {
            throw new IllegalArgumentException("유효하지 않은 나이입니다.");
        }
    }
}
