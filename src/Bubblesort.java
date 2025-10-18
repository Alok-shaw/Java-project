import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.print(Arrays.toString(bubblesort(arr)));
    }
    public static int[] bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
