import java.util.Arrays;

public class REMOVEduplicates {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,4};
        int[] arrn=new int[arr.length];
        int k=1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[i-1]){
             arrn[k]=arr[i];
             k++;
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(arrn));
    }
}
