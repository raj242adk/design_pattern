package sevensem.disignpattern.factorydesign;

public class Car implements Vehical{
    @Override
    public void Start() {
        System.out.println("Hello the car is starting");
    }

    @Override
    public void Stop() {
        System.out.println("Hello the car has stopped");

    }
}
