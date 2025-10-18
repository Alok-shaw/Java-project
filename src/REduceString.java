public class REduceString {
    public static void main(String[] args) {
        String str="aaaaahhhheeee";
        String newr="";
        char[] arr=str.toCharArray();
        int i,c;
        for(i=0;i<arr.length;i=c+i){
            c=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            newr=newr+arr[i]+c;
        }
        System.out.println(newr);
    }
}
