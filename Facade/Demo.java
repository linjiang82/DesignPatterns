package Facade;

public class Demo {
    public static void main(String[] args) {
        CutomerBanking cutomerBanking = new CutomerBanking(123456,1234);
        cutomerBanking.withdrawal(50);
        cutomerBanking.deposit(100);
        cutomerBanking.withdrawal(1250);
    }
}
