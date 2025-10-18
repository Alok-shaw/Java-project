public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=11;
        System.out.print(binarysearch(arr,target));

    }
    static int binarysearch(int arr[],int target){
        int mid;
        int end=arr.length-1;
        int start=0;
        while(start<=end){
            mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
           else{
                end=mid-1;
            }
        }
        return -1;  // not found
    }
}
