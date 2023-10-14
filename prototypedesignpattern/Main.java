package sevensem.prototypedesignpattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Creating Object using prototype pattern");
        DBConnection connection = new DBConnection();
        connection.setUrl("jdbc connection");
        connection.setUserName("root");
        connection.LoadData();
        System.out.println(connection);

        //cloning new object
        DBConnection connection1= (DBConnection) connection.clone();
        System.out.println(connection1);


    }
}
