package ServiceLocator;

import ServiceLocator.Cache;

public class ServiceLocator {
    private static Cache cache;
    static {
        cache = new Cache();
    }
    public static Service getService(String s){
       final Service  service = cache.getService(s);
       if(service!=null){
           System.out.println("found in cache");
           return service;
       }
       InitialContext context = new InitialContext();
       Service serv = context.lookup(s);
       cache.addService(serv);
       return serv;


    }
}
