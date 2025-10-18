import java.util.Scanner;
public class BINARYSEARCHUSINGRECURSION {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter your target ");
        int target=in.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int s = 0;
        int e = arr.length - 1;
        int re = binary(arr,target, s, e);
        System.out.println(re);
    }

    static int binary(int arr[], int target, int s, int end) {
        if(s>end){
            return -1;   // there means the target element is not founded at any index or position in arrays
        }
        int mid = (s + end) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binary(arr, target, mid + 1, end);
        } else {
            return binary(arr, target, s, mid - 1);
        }
    }
}
