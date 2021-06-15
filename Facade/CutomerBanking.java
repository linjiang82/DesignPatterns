package Facade;

public class CutomerBanking {
    private int accountNo;
    private int pin;
    private CheckAccount checkAccount = new CheckAccount();
    private CheckPin checkPin = new CheckPin();
    private CheckBalance checkBalance = new CheckBalance();

    public CutomerBanking(int accountNo, int pin) {
        this.accountNo = accountNo;
        this.pin = pin;
    }

    void deposit(int amount) {
        if (checkAccount.checkAccount(this.accountNo) && checkPin.checkAccount(this.pin)) {
            checkBalance.setBalance(checkBalance.getBalance() + amount);
            System.out.println("Deposit Successful, the balance is " + checkBalance.getBalance());
        } else {
            System.out.println("Something goes wrong");
        }

    }

    void withdrawal(int amount) {
        if (checkAccount.checkAccount(this.accountNo) && checkPin.checkAccount(this.pin) && checkBalance.checkBalance(amount)) {
            checkBalance.setBalance(checkBalance.getBalance() - amount);
            System.out.println("Withdrawal Successful, the balance is " + checkBalance.getBalance());
        } else {
            System.out.println("Something goes wrong");
        }
    }
}
