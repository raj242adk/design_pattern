package sevensem.designpattern.factory;

public class BackEndDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("The Salary of Backend Developer is");
        return 90000;
    }
}
