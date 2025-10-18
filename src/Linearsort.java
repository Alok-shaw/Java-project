import java.util.Arrays;

public class Linearsort {
    public static void main(String[] args) {
        int[] arr={64,34,25,12,22,11,90,1,1,1,1,1,1};
        int[] s=sort(arr);
        System.out.println(Arrays.toString(s));

    }
    static int[] sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=1+i;j<a.length ;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
