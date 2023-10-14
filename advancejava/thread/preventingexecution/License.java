package sevensem.advancejava.thread.preventingexecution;

public class License {
    public static void main(String[] args) throws InterruptedException {
        Medical medical = new Medical();
        medical.start();
        medical.join();


        Trial t = new Trial();
        t.start();
        t.join();


        Document document = new Document();
        document.start();

    }




}

