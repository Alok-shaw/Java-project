import java.util.Arrays;
import java.util.*;
public class Leetcode977 {
    public static void main(String[] args) {
        int[] arr={2,3,1,-4,5,2,2,2,2,2,2};
        int[] a=squaresarray(arr);
        System.out.println(Arrays.toString(a));

    }
    static int[] squaresarray(int[] a){
       // int[] m=new int[a.length];
        for(int i=0;i<a.length;i++){
            a[i]=(int) Math.pow(a[i],2);
        }
        int minindex,i,j;
        for(i=0;i<a.length;i++){
            minindex=i;
            for(j=i+1;j<a.length;j++){
                if(a[minindex]>a[j]){
                    minindex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
        return a;
    }
}
