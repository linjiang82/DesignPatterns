package Facade;

public class CheckBalance {
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int balance = 1000;

    public boolean checkBalance(int amount){
        if(amount > getBalance()){
            return false;
        }
        else return true;
    }
}
