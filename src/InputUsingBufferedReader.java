import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

void main() throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
    System.out.println("Enter your name: ");
    String s = br.readLine();
    String intro = STR."Hello I am \{s}";
    System.out.println(intro);
}