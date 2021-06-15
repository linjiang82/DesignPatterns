package Facade;

public class CheckPin {
    public int getPinCode() {
        return pinCode;
    }

    private  int pinCode =1234;
    public Boolean checkAccount(int pinCode){
        if(pinCode == getPinCode()){
            return true;
        }
        else return false;
    }
}
