import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        System.out.print(Arrays.toString(selectionsort(arr)));

    }
    static int[] selectionsort(int[] arr){
        int minindex=0,i,j;
        for(i=0;i<arr.length;i++){
            minindex=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        return arr;
    }
}
