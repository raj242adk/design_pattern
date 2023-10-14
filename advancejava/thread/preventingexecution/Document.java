package sevensem.advancejava.thread.preventingexecution;

public class Document extends Thread {

    public void run() {

        try {
            System.out.println("I am the officer let's sign the documet");
            Thread.sleep(1000);
            System.out.println("Okay Yup drive slowly your license has been issued");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
