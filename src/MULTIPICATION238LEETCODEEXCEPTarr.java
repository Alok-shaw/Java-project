import java.util.Arrays;

public class MULTIPICATION238LEETCODEEXCEPTarr {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] arr=mul(a);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mul(int[] a){
        int[] arr=new int[a.length];
        for(int i=0;i<a.length;i++){
            int sum=1;
            for(int j=0;j<a.length;j++){
                if(i==j){
                }
                else{
                    sum=sum*a[j];
                }
            }
           // System.out.println();
            arr[i]=sum;
        }
        return arr;
    }
}
