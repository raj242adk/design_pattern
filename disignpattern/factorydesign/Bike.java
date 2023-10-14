package sevensem.disignpattern.factorydesign;

public class Bike implements Vehical{
    @Override
    public void Start() {
        System.out.println("The Bike is Started");
    }

    @Override
    public void Stop() {
        System.out.println("The Bike is Stopped");
    }
}
