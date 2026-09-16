package day5;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else if(amount > this.balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("출금 금액은 0보다 커야 합니다.");
        }
    }

    public int getBalance() {
        return this.balance;
    }

    public void showAccount() {
        System.out.println(this.owner+"님의 현재 잔액: "+this.balance+"원");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("윤환", 10000);
        account.deposit(5000);
        account.withdraw(3000);
        account.showAccount();
    }
}
