public class InterfaceInJava {
    public static void main(String[] args) {
        Axis axis = new Axis();
        axis.deposit();
        axis.withdraw();
        axis.loan();
    }
}

interface Bank{
    void deposit();
    void withdraw();
    void loan();
}

class Axis implements Bank{
    public void deposit() {
        System.out.println("deposit");
    }
    public void withdraw() {
        System.out.println("withdraw");
    }
    public void loan() {
        System.out.println("loan");
    }
}