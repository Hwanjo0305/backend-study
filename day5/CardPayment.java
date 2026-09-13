package day5;

public class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 "+amount+"원을 결제합니다.");
    }
}
