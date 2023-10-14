package sevensem.advancejava.thread.preventingexecution;

public class Yield extends Thread{

    public void run() {
        try{
            Thread.yield();
        for (int i =5;i>=0;i--){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Yield t = new Yield();
        t.start();

        //thread handler can ignore or accept the thread.yeald method();

        //if you want to main method to stop and provieds
        //other method the chance of execution
        for (int i =5;i>=0;i--){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
