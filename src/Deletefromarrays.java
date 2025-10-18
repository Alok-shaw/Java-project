import java.util.Arrays;

public class Deletefromarrays {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        System.out.println(ar.length);
        int[] re=delete(ar,3);
        System.out.println(Arrays.toString(re));
        int[] re1=insert(re,3,4);
        System.out.println(Arrays.toString(re1));

    }
    static int[] delete(int[] a,int index){
        if(a.length<=0){
            return a;
        }
        int[] arr=new int[a.length-1];
        for(int i=0;i<arr.length;i++){
            if(i==index){
                arr[i]=a[i+1];
            }
            if(i<index){
                arr[i]=a[i];
            }
            else{
                arr[i]=a[i+1];
            }
        }
        return arr;
    }
    static int[] insert(int[] arr,int index,int element){
        if(arr.length<=0){
            return arr;
        }
        int[] arr1=new int[arr.length+1];
        for(int i=0;i<arr1.length;i++){
            if(i==index){
                arr1[i]=element;
            }
            if(i<index){
                arr1[i]=arr[i];
            }
            else{
                arr1[i]=arr[i-1];
            }
        }
        return arr1;
    }
}
