public class RICHESTwealthleetcode {
    public static void main(String[] args) {
        int[][] arr={{},{4,5,6},{9}};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum1=0;
            for(int j=0;j<arr[i].length;j++){
                sum1=sum1+arr[i][j];
            }
            if(sum1>sum2){
                sum2=sum1;
            }
        }
        System.out.println("highest wealth "+sum2);
    }
}
