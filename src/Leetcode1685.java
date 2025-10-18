import java.util.Arrays;

public class Leetcode1685 {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int[] ar=abs(arr);
        System.out.println(Arrays.toString(ar));

    }
    static int[] abs(int[] nums){
        int sum=0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=0;j<nums.length;j++){
                sum=sum+(int)Math.abs(nums[i]-nums[j]);
            }
            res[i]=sum;
        }
        return res;
    }
}
