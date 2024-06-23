import java.util.Scanner;

public class InputUsingScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i = sc.nextInt();
        System.out.println("Enter a decimal number: ");
        float f = sc.nextFloat();
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        sc.next();
        int i2 = sc.nextInt();
        sc.close();
    }
}