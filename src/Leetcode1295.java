public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,12,5658};
        int re=even(arr);
        System.out.println(re);

    }
    static int even(int[] a){
        int s=0;
        int k=0;
        for(int i=0;i<a.length;i++){
            s=0;
            while(a[i]>0){
                int rem=a[i]%10;
                a[i]=a[i]/10;
                s++;
            }
            if(s%2==0){
                k++;
            }
        }
        return k;
    }
}
