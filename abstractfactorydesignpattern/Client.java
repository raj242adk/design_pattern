package sevensem.abstractfactorydesignpattern;

public class Client {

    public static void main(String[] args) {
        //i want to get android developer

        Employee employee=EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        employee.name();
        System.out.println(employee.salary());

        //client doesnot know where the employyee object is created
        //even employeefactory doesnot know where the object is created

    }
}
