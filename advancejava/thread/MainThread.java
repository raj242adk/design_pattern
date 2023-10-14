package sevensem.advancejava.thread;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MultiThreadDemo());
        thread.start();
        System.out.println("...............After thread start......................");
    }
}
