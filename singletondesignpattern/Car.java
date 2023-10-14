package sevensem.singletondesignpattern;

public class Car {
    //static variable are null bydefualt if it is object type
    private static Car car;

    private Car(){

    }

    public static Car getCar(){
       if(car==null){
           car=new Car();
       }
       return car;
    }
}
