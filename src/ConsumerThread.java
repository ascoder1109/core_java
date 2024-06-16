public class ConsumerThread extends Thread{
    Company c;
    ConsumerThread(Company c) {
        this.c = c;
    }
    public void run() {
        int i = 1;
        while (true){
            try {
                this.c.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
