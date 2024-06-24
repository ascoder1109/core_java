public class TryCatch {
    public static void main(String[] args) {
        try{
            int ans = 2/0;
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I am final block");
        }
    }
    
}