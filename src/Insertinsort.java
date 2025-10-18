import java.util.Arrays;
import java.util.Scanner;
public class Insertinsort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("enter your array element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print(Arrays.toString(insertionsort(arr)));
    }
    static int[] insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
