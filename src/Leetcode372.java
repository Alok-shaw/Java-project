public class Leetcode372 {
    public static void main(String[] args) {
        int a=2;
        int[] arr={1,0};
        int re=s(a,arr);
        System.out.println(re);

    }
    static int  s(int a,int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }
        int re=(int) Math.pow(a,sum);
        return re;
    }
}
