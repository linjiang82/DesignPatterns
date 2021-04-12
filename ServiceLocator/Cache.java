package ServiceLocator;

import ServiceLocator.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services= new ArrayList<>();
    public Service getService(String s){
       for(Service service: services){
           if(service.getName()==s){
               return service;
           }
       }
       return null;
    };
    public void addService(Service s){
        boolean exist=false;
        for(Service service: services){
            if(service.getName()==s.getName()){
                exist = true;
            }
        }
        if(!exist) services.add(s);
    }

}
