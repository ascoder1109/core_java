public class ProducerThread extends Thread{
    Company c;
    ProducerThread(Company c){
        this.c = c;
    }
    public void run(){
        int i = 1;
        while(true){
            try {
                this.c.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
            Thread.sleep(1000);

            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
}
