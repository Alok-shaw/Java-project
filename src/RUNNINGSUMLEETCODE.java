import java.util.Arrays;

public class RUNNINGSUMLEETCODE {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0 };
       int[] ar= sum(arr);
        System.out.println(Arrays.toString(ar));

    }
    static int[] sum(int[] a){
        int[] arr=new int[a.length];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+a[j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}
