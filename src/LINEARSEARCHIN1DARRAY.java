import java.util.Scanner;

public class LINEARSEARCHIN1DARRAY {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      //  System.out.println("enter target ");
       // int n=in.nextInt();
        int[] arr={2,3,4,6,7,8,9,11};
        boolean result1=search(arr,9);
        System.out.println(result1);
        boolean result2=search(arr,89);
        System.out.println(result2);

    }
    static boolean search(int[] arr,int target){
        int s=0;
        int end=arr.length-1;
        int mid;
        while(s<end){
            mid=(s+end)/2;
            if(arr[mid]==target){
                return true;
            } else if (target >arr[mid]) {
                s=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return false;
    }
}
