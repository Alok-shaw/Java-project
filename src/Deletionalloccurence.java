import java.util.Arrays;

public class Deletionalloccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,4,3,2,8,2};
        int target = 2;

        int[] narr = new int[arr.length];
        int j = 0;  // index for new array

        // copy only non-target elements
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                narr[j] = arr[i];
                j++;
            }
        }
        int[] result = Arrays.copyOf(narr, j);
        System.out.println(Arrays.toString(result));
    }
}
