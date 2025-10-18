import java.util.Arrays;

public class MERGINGSORTEDARRAY {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={2,4,8,10,12,13};
        int arrn[]=new int[arr2.length+arr1.length];
        for(int i=0;i<arr1.length;i++){
            arrn[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arrn[arr1.length+i]=arr2[i];
        }
        for(int i=0;i<arrn.length;i++){
            for(int j=i+1;j<arrn.length;j++){
                if(arrn[i]>arrn[j]){
                    int temp=arrn[i];
                    arrn[i]=arrn[j];
                    arrn[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrn));
    }
}
