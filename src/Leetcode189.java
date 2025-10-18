import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode189 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        rotate(arr,2);

    }
    static int[] rotate(int[] a,int k){
        for(int i=0;i<k;i++){
            int last = a[a.length - 1];        // last element store karo
            for(int j = a.length - 1; j > 0; j--){
                a[j] = a[j - 1];               // elements ko right shift karo
            }
            a[0] = last;                       // last element ko first me daal do
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
