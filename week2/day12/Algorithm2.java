package day12;

public class Algorithm2 {
    public static void main(String[] args) {
        String text = "backenddeveloper";
        int count = 0;
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
                count++;
            }
        }
        System.out.println(count);
    }   
}
