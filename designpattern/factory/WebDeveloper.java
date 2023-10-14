package sevensem.designpattern.factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("The Salary Of WebDeveloper ");
        return 50000;
    }
}
