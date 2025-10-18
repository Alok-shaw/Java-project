import java.util.*;
public class Leetcode219 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int k=3;
        boolean re=s(arr,k);
        System.out.println(re);

    }
    static boolean s(int nums[],int k){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && (int)Math.abs(i-j)<=k ){
                    return true;
                }
            }
        }
        return false;
    }
}
