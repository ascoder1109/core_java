public class Encapsulation {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        piggyBank.addMoney(5000);
        System.out.println(piggyBank.getBalance());
        piggyBank.addMoney(5000);
        System.out.println(piggyBank.getBalance());
    }

}

class PiggyBank{
    private int balance;

    //Setter
    public void addMoney(int amountToAdd){
        this.balance += amountToAdd;
    }

    //Getter
    public int getBalance(){
        return this.balance;
    }
}
