package sevensem.advancejava.thread.intruptingthreadmethod;

public class App extends Thread {
    @Override
    public void run() {
        try {

            System.out.println(Thread.currentThread().isInterrupted());
            //System.out.println(Thread.interrupted());
            for (int i = 5; i >= 0; i--) {
                System.out.println(Thread.currentThread().isInterrupted()+" "+i);
                Thread.sleep(1000);

            }
        }catch (Exception e){
            System.out.println("Some thing went wrong");
        }
    }

    public static void main(String[] args) {
        App a = new App();
        a.start();
        a.interrupt();

    }
}
