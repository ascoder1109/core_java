import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferedReaderClass {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Enter a string: ");
        String s = br.readLine();

    }
}
