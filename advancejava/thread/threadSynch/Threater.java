package sevensem.advancejava.thread.threadSynch;

public class Threater {

    static int total_seats=10;
    int seats;
     synchronized  static public void book(int seats)  {
             if(total_seats>=seats){
                 System.out.println("Movie seats booked Successfully"+Thread.currentThread().getName());
                 System.out.println("Total remaining seats is "+(total_seats-seats));

             }
             else{
                 System.out.println("The Seat is already full");


             }
    }

}

