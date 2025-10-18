import java.util.*;
public class Leetcode2586 {
    public static void main(String[] args) {
        String[] arr={"n","a","o"};
        int re=countvowel(arr,0,2);
        System.out.println(re);

    }
    static int countvowel(String[] arr,int s,int e){
        String combined = String.join("", arr); // "helloworld"
        char[] ch = combined.toCharArray();
        System.out.println(Arrays.toString(ch));
        int c=0;
        if ( (ch[s]=='a' || ch[s]=='e' || ch[s]=='i' || ch[s]=='o' || ch[s]=='u')
                &&
                (ch[e]=='a' || ch[e]=='e' || ch[e]=='i' || ch[e]=='o' || ch[e]=='u') ) {
            // Both start and end are vowels
        } else {
            return c;
        }

        for(int i=s;i<=e;i++){
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    c++;
                }
            }

        return c;
    }
}
