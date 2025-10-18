import java.util.Arrays;
public class INtersectionoftwoarray {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        int k=0;
        int[] newarr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            boolean al=false;
            for(int j=0;j<arr2.length;j++) {
                if (arr1[i] == arr2[j]) {
                    newarr[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
      //  System.out.println(k);
       // System.out.println(Arrays.toString(newarr));
        int l=0;
        int[] s=new int[k];
        for(int i=0;i<k;i++){
            boolean alex=false;
            for(int j=0;j<l;j++) {
                if (newarr[j] == newarr[i]) {
                    alex=true;
                    k--;
                    break;
                }
            }
            if(!alex){
                s[l]=newarr[i];
                l++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(s,l)));
    }
}
