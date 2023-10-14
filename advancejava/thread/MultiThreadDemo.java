package sevensem.advancejava.thread;

public class MultiThreadDemo implements Runnable{
    @Override
    public void run() {
       try {

           System.out.println("Start Thread");
           Thread.sleep(5000);
           System.out.println("Thread End");

       }catch (InterruptedException e){
           System.out.println(e);
       }
    }
}
