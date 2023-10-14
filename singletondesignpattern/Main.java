package sevensem.singletondesignpattern;

public class Main {
    public static void main(String[] args) {
        Car car= Car.getCar();
        Car car1=Car.getCar();

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
    }
}
