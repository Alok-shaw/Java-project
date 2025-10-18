import javax.swing.text.html.HTML;

public class Leetcode33 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int r=searchinrotetedarray(arr,4);
        System.out.println(r);
    }
    static int searchinrotetedarray(int[] a,int target){
        int s=0;
        int end=a.length-1;
        int mid;
        while(s<=end){
            mid=(s+end)/2;
            if(target==a[mid]){
                return mid;
            }
            if(target>=a[s] && target<a[mid]){
                end=mid-1;
            }
            if(target>=a[end] && target<a[mid]){
                s=mid-1;
            }
        }
        return -1;
    }
}
