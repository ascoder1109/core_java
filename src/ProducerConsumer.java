public class ProducerConsumer {
    public static void main(String[] args) {

    }
}

class Company{
    int n;
    boolean f = false;
    synchronized public void produce_item(int n) throws InterruptedException {
        if (f){
            wait();
        }
        this.n = n;
        System.out.println(STR."Produced : \{this.n}");
        f = true;
        notify();
    }
    synchronized public int consume_item() throws InterruptedException{
        if (!f){
            wait();
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
