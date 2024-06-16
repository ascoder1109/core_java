public class UserDefinedException {
    public static void main(String[] args) throws AgeException {
        int age = 10;
        if (age < 18) {
            throw new AgeException("You should be older than 18!");
        }
        else{
            System.out.println("Proceed");
        }
    }

}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
