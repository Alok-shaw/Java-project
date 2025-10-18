import java.util.Arrays;

public class SUMOFALLNUMBERINARRAYLEETCODE {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] a=sumofallelement(arr);
        System.out.println(Arrays.toString(a));
    }
    static int[] sumofallelement(int[] a){
        int sum=0;
        int[] arr=new int[a.length];
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=1+i;j<a.length;j++){
                sum=sum+a[j];
            }
            sum=sum+a[i];
            arr[i]=sum;

        }
        return arr;
    }
}
