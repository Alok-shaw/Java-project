import java.util.Arrays;

public class TWosumleetcode {
    public static void main(String[] args) {
        int[] arr={2,3,7,11};
        int target=9;
        System.out.print(Arrays.toString(twosum(arr,target)));

    }
    public static int[] twosum(int[] arr,int target){
        int[] idx=new int[2];
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    idx[0]=i;
                    idx[1]=j;
                    return idx;
                }
            }
       }
        return new int[]{-1,-1};    // this mean not found
    }
}
