public class MultiThreadingUsingImplements {
    public static void main(String[] args) {
        MuitiThreadingDemo t1 = new MuitiThreadingDemo();
        Thread thread = new Thread(t1);
        AnotherThreadingDemo t2 = new AnotherThreadingDemo();
        thread.start();
        thread.getName();
        t2.start();
        t2.getName();
    }
}

class MuitiThreadingDemo implements Runnable{
    public void run(){

        for(int i=0; i<10; i++){
            System.out.println(STR."Value of i of runnable is:\{i}");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class AnotherThreadingDemo extends Thread{
    public void run(){
        for(int i=10 ; i>=0; i--) {
            System.out.println("Value of i of class is:" + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}