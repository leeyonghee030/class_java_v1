package useful.ch11;

public class BankAccount {

    int money = 100_000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    //출금 입금

    //synchronized <-- 동기화처리 순차적으로 코드를 수행하도록 보장
    public synchronized void saveMoney(int money) {
        int currentMoney = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setMoney(currentMoney+ money);
        System.out.println("입금 후 계좌 잔액 : " + getMoney());

    }

    //출금
// synchronized 하나만 하면 왜 안될까 2개밖에없고 동기화했는데 ??
    public synchronized int withdraw(int money) {
        int currentMoney = getMoney();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (currentMoney < money) {
            System.out.println("잔액부족");
        } else {
            setMoney(currentMoney - money);
            System.out.println("출금 후 계좌 잔액 : " + getMoney());

            return money;
        }
        return 0;
    }
}
