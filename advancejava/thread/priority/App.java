package sevensem.advancejava.thread.priority;

public class App extends Thread{

    public void  run(){
        System.out.println("I am run thread");
//        Thread.currentThread().setPriority(3);
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(4);
        App a = new App();
        a.start();
        System.out.println("helllo");

        System.out.println(Thread.currentThread().getPriority());
    }
}
