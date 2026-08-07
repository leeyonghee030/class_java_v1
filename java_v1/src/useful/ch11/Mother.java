package useful.ch11;

public class Mother extends Thread{

    BankAccount bankAccount;

    public Mother(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        //어머니가가 5000원 출금
        bankAccount.withdraw(5_000);
    }
}
