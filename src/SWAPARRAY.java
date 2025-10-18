import java.util.Arrays;

public class SWAPARRAY {
    public static void main(String[] args) {
        int[] arr={5,10,3,25,8};
        for(int i=0;i<(arr.length)/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-i-1]=temp;
        }
        System.out.print(Arrays.toString(arr));
//        for(int j=0;j<arr.length;j++){
//            System.out.print(" "+arr[j]);
//        }
    }
}
