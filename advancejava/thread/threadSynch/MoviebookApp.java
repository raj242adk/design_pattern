package sevensem.advancejava.thread.threadSynch;

public class MoviebookApp extends Thread{
   static  Threater t ;
   int seats;
    public void run(){
            t.book(seats);
    }

    public static void main(String[] args) throws InterruptedException {
        t=new Threater();

        MoviebookApp app = new MoviebookApp();
        app.seats=9 ;
        app.start();

        MoviebookApp app1 = new MoviebookApp();
        app1.seats=1 ;
        app1.start();


    }
}
