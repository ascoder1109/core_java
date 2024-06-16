public class MuitiThreadingInJava {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){
            MultiThreadingDemo obj = new MultiThreadingDemo();
            obj.start();
        }
    }

}

class MultiThreadingDemo extends Thread{
    public void run(){
        try{
            System.out.println(STR."Thread: \{Thread.currentThread().threadId()} is running");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}