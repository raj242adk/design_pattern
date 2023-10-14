package sevensem.advancejava.thread.preventingexecution;

public class SleepM extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i+Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        SleepM t= new SleepM();
        t.start();
        SleepM t2= new SleepM();
        t2.start();
    }
}
