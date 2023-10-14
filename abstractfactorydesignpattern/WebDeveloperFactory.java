package sevensem.abstractfactorydesignpattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
