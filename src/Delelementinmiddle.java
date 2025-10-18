import java.util.Arrays;
public class Delelementinmiddle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int len=arr.length;
        int[] arrn=new int[arr.length-1];
        int ele=3;
        int targetidx=0;
        for(int i=0;i<arr.length;i++){
           // for(int j=0;j<arr.length-1;j++) {
                if (arr[i] == ele) {
                    targetidx = i;
                    break;

                }
        }
        for(int i=0;i<arrn.length;i++){
            if(i<targetidx){
                arrn[i]=arr[i];
            }
            else if(targetidx<=i){
                arrn[i]=arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arrn));

    }
}
