import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
//        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
        int[][] multidimArr = {{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0; i < multidimArr.length; i++) {
            for(int j = 0 ; j < multidimArr.length ; j++){
                System.out.print(multidimArr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}