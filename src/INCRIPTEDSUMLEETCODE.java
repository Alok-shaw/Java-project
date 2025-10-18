public class INCRIPTEDSUMLEETCODE {
    public static void main(String[] args) {
        int[] num={3,43};
        int result=sum(num);
        System.out.println(result);
    }
    static int  sum(int[] arr){
        int sum=0;
        int max=0;
        int e=0;
        int co=0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        while(sum>0) {
            int rem= sum % 10;
            if(rem>max){
                max=rem;
            }
            co++;
            sum=sum/10;
        }
        for(int i=0;i<co;i++){
            e=e*10+max;
        }
        return e;
    }
}
