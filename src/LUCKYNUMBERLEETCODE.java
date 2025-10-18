public class LUCKYNUMBERLEETCODE {
    public static void main(String[] args) {
        int[] arr={2,3,3};
       int r= lucky(arr);
        System.out.println(r);

    }
    static int lucky(int[] arr){
        int c=1;
        int l=-1;
      //  int k=1;
        for(int i=0;i<arr.length-1;i++){
            c=1;
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==arr[i]){
                l=arr[i];
            }
        }
       // if()
        return -1;
    }
}
