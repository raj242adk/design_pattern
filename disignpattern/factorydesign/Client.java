package sevensem.disignpattern.factorydesign;

public class Client {
    public static void main(String[] args) {
        VehicalFactory carfactory=new CarFactory();
        Vehical car=carfactory.createVehical();
        car.Start();
        car.Stop();
    }
}
