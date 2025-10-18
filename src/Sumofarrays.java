import java.util.Scanner;
public class Sumofarrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        System.out.print("enter size of array :");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.print("enter element in array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int result=sum(arr,sum);
        System.out.println("sum of element "+result);
    }
    public static int sum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
