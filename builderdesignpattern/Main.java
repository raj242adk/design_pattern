package sevensem.builderdesignpattern;

public class Main {
    public static void main(String[] args) {
       User user= new User.userBuilder().setEmail("Raj242adk@gmail.com").setUserName("Rabindra Adhikar").setUserAddress("Jhapa").build();
        System.out.println(user);
    }
}
