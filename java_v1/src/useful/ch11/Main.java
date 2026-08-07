package useful.ch11;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        //입금 일 위임 -> 10_000원 입금
        Father father = new Father(bankAccount);
        father.start();
        //출금 일 위입 -> 5000원 출금
        Mother mother = new Mother(bankAccount);
        mother.start();
        //기대값 105_000원 정상 동작
    }


}
