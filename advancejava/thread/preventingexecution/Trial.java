package sevensem.advancejava.thread.preventingexecution;

public class Trial extends Thread {

    public void run() {

        try {
            System.out.println("Trial is started");
            Thread.sleep(1000);
            System.out.println("Trial completed");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
