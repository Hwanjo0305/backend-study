package day5;

public class KakaoPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원을 결제합니다.");
    }
    
}
