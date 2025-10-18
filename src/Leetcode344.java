import java.util.Arrays;

public class Leetcode344 {
    public static void main(String[] args) {
        char[] arr={'h','e','l','l','o'};
        reverse(arr);
    }
    static void reverse(char ch[]){
        for(int i=0;i<(ch.length)/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(ch));
    }
}
