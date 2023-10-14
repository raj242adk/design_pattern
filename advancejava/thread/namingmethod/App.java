package sevensem.advancejava.thread.namingmethod;

public class App {
    public static void main(String[] args) {
        Thread.currentThread().setName("Raj");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);

    }
}
