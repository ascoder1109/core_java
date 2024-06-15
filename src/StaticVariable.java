public class StaticVariable {
    static int m1() {
        System.out.println("from m1");
        return 20;
    }
    static int a = m1();

    public static void main(String[] args) {
        System.out.println(a);

    }
}
