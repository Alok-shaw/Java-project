import java.util.Arrays;

public class Firstandlastoccurence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4,4,4,4,5};
        int[] n=range(arr,4);
        System.out.println(Arrays.toString(n));

    }
    static int[] range(int[] a,int target){
        int s=0;
        int en=a.length-1;
        int first=0;
        while(s<=en){
            int mid=(s+en)/2;
            if(a[mid]==target){
                first=mid;
                en=mid-1;
            }
            if(target<a[mid]){
                en=mid-1;
            }
            if(target>a[mid]){
                s=mid+1;
            }
        }
        s = 0;
        en = a.length - 1;
        int last=0;
               while (s <= en) {
            int mid = (s + en) / 2;
            if (a[mid] == target) {
                last = mid;
                s = mid + 1;
            } else if (target < a[mid]) {
                en = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return new int[]{first, last};
    }
}
