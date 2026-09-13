package day5;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment1 = new CardPayment();
        Payment payment2 = new KakaoPayment();

        payment1.pay(10000);
        payment2.pay(20000);
    }
}
