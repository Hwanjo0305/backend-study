package day4;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void showAccount() {
        System.out.println(this.owner+"님의 현재 잔액: "+this.balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("윤환", 10000);
        account.deposit(5000);
        account.withdraw(3000);
        account.showAccount();
    }
}
