package sevensem.designpattern.factory;
//This class have the factory method which
//Return the employee object based on Input
public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(String empType ){
        if(empType.trim().equalsIgnoreCase("BACKEND DEVELOPER")){
            return new BackEndDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();

        }else {
            return null;
        }


    }

}
