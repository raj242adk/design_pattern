package sevensem.disignpattern.factorydesign;

public class CarFactory implements VehicalFactory{

    @Override
    public Vehical createVehical() {
        return new Car();
    }
}
