public class ROTATELEETCODE48 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] re=rotate(arr);
        for(int i=0;i<re.length;i++){
            for(int j=0;j<re.length;j++){
                System.out.print(re[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] rotate(int[][] a){
       int[][] arr=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                arr[j][i]=a[a.length-1-i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = arr[i][j];
            }
        }
        return a;
    }
}
