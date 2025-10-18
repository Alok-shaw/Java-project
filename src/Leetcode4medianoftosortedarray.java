import java.util.Arrays;

public class Leetcode4medianoftosortedarray {
    public static void main(String[] args){
        int[] arr={1,2};
        int[] arr1={3,4,2,3,4,3};
       double medians= median(arr,arr1);
        System.out.println(medians);
    }
    static double median(int[] a,int[] b){
        double me;
        int[] n=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            n[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            n[a.length+i]=b[i];
        }
//        for(int i=0;i<n.length;i++){
//            for(int j=i+1;j<n.length;j++){
//                if(n[i]>n[j]){
//                    int temp=n[i];
//                    n[i]=n[j];
//                    n[j]=temp;
//                }
//            }
//        }
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        if(n.length%2==1){
            me=n[(n.length)/2];
            return me;
        }
        else{
            int le=n.length-1;
            int le1=n.length;
            me=(n[le/2]+n[le1/2])/2.0;
            return me;
        }
    }
}
