
public class UserDefinedException {
    int balance = 5000;
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(6000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    


}
class ATM {

    private double balance = 100.0; // Assume initial balance
  
    public void withdraw(double amount) throws InsufficientFundException {
      if (amount > balance) {
        throw new InsufficientFundException("Sorry, insufficient funds in your account.");
      }
      balance -= amount;
      System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }
  }
class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        super(message);
    }
}
