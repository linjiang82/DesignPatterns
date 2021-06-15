package Facade;

public class CheckAccount {
    public int getAccountNo() {
        return accountNo;
    }

    private  int accountNo=123456;
    public Boolean checkAccount(int accountNo){
       if(accountNo == getAccountNo()){
           return true;
       }
       else return false;
    }
}
