import java.util.Arrays;

public class InsertIntoarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,4,5,4,3};
        int idx=3,ele=10;
        int arr1[]=new int[arr.length+1];
        for(int i=0;i<arr1.length;i++){
            if(i<3){
                arr1[i]=arr[i];
            }
            else if(i==idx){
                arr1[i]=ele;
            }
            else if(i>idx){
                arr1[i]=arr[i-1];
            }
        }
        System.out.print(Arrays.toString(arr1));
    }
}
