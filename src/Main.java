import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(Arrays.toString(arr[arr.length-1-i]));
            System.out.print(" " + arr[arr.length - i - 1]);
        }
    }
}