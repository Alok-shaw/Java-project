import java.util.Arrays;

public class Leetcode58 {
    public static void main(String[] args) {
        String s="alok shaw   dubey    ";
        String sr = s.trim().replaceAll("\\s+", " ");  // remove extra spaces
        String[] arr = sr.split(" ");  // split by single space
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1].length());
    }
}
