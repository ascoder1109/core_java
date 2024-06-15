import java.util.Arrays;

void main(){
    int[] arr = {1,2,3,4,5,6,7,8,9};
    Arrays.stream(arr).forEach(System.out::println);
}