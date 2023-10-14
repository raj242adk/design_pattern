package sevensem.advancejava.thread.preventingexecution;

public class JoinM extends Thread{
    static Thread mainThread;
    public void run(){

        for (int i=5;i>=0;i--){
            try {
                mainThread.join();
                System.out.println(Thread.currentThread().getName()+"-"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

    public static void main(String[] args) throws InterruptedException {
         mainThread = Thread.currentThread();
        JoinM t = new JoinM();
        t.start();
        //t.join();
        for (int i=5;i>=0;i--){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }

    }
}
