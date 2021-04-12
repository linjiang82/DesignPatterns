package ServiceLocator;

public class InitialContext {
    public Service lookup(String s){
    if(s=="Service1"){
        return new Service1();
    }
    else if(s=="Service2"){
        return new Service2();
    }
    return null;
    }
}
