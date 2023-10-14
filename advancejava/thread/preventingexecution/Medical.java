package sevensem.advancejava.thread.preventingexecution;

public class Medical extends Thread{

    public void run(){
        try {
            System.out.println("I am doing medical checkup");
            Thread.sleep(1000);
            System.out.println("I completed Medical checkup");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

}