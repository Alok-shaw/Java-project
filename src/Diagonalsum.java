public class Diagonalsum {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int k = 0;
        int sum = 0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
                // j=i;
                sum = sum + arr[i][i];
                sum=sum+arr[i][arr.length-i-1];
            }
        if((arr.length)%2!=0){
            sum=sum-arr[arr.length/2][arr.length/2];
            }
        System.out.println("sum of both diagonals --> "+sum);
        }
    }
