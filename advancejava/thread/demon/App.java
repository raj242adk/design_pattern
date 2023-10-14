package sevensem.advancejava.thread.demon;

public class App extends Thread {

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Demon Thread Execute");
        }
        else {
            System.out.println("run thread execute");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello ");
        App a = new App();
//        a.setDaemon(true);
        a.start();
    }
}
