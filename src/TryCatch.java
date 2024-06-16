public class TryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int i = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
