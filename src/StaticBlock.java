public class StaticBlock {
        static int a = 45;
        static int b ;
        static{
            System.out.println("static block");
            b = a * 4;
        }
        public static void main(String[] args) {
            System.out.println(a);
            System.out.println(b);
        }
}
