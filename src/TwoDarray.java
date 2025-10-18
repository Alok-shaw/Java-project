import java.util.Arrays;
public record TwoDarray() {
    public static void main(String[] args) {
        int sum=0;
     int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     int max=arr[0][0];
     int min=arr[0][0];
       for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
              sum=sum+arr[i][j];
              if(arr[i][j]>max){
                  max=arr[i][j];
              }
              if(arr[i][j]<min){
                  min=arr[i][j];
              }
          }
      }
        System.out.println("minimum--> "+min+" maximum-->"+max+" sum-->"+sum);
    }
}
