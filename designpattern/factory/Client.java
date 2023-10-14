package sevensem.designpattern.factory;

public class Client {
    public static void main(String[] args) {
       Employee employee= EmployeeFactory.getEmployee("WEB DEVELOPER");
      int salary= employee.salary();
      System.out.println("The Salary is "+salary);

    }
}
