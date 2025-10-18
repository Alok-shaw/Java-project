public class Simplehashmove {
    public static void main(String[] args) {
        String str="#move#the##hash";
        char[] arr=str.toCharArray();
        String ans="";
        int hashcount=0;
        int lettercount=0;
        for(int i=0;i<str.length()  ;i++){
            if(arr[i]=='#'){
                hashcount++;
            }
            else if(arr[i]>='a' && arr[i]<='z'){
                lettercount++;
            }
        }
        for(int i=0;i<hashcount;i++){
            ans=ans+"#";
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!='#'){
                ans=ans+arr[i];
            }
        }
        System.out.print(ans);
    }
}
