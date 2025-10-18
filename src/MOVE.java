import java.util.Arrays;

public class MOVE {
    public static void main(String[] args) {
        String str="#move#the##hash";
        char[] arr=str.toCharArray();
        int hashcount=0,lettercount=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == '#') {
                hashcount++;
            } else if (arr[i]>='a' && arr[i]<='z') {
                lettercount++;
            }

        }
        char arr1[]=new char[hashcount];
        char arr2[]=new char[lettercount];
        char target='#';
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                arr1[j]=target;
                j++;
            }
        }
        int k=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr2[k]=arr[i];
                k++;
            }
        }
        int new1=arr1.length+arr2.length;
        char nsize[]=new char[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            nsize[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            nsize[arr1.length+i]=arr2[i];
        }
        for(int i=0;i<nsize.length;i++){
            System.out.print(nsize[i]);
        }
    }
}
