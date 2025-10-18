public class Leetcode541 {
    public static void main(String[] args) {
        String n="abcdefg";
        String str=reverse(n,2);
        System.out.println(str);
    }
    static String reverse(String s,int k){
        char[] ch=s.toCharArray();
        for(int i=0;i<1;i++){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        if(ch.length>2*k){
            for(int i=0;i<1;i++){
                char te=ch[k*2];
                ch[k*2]=ch[k*2+1];
                ch[k*2+1]=te;

            }
        }
        String n=String.valueOf(ch);
        return n;
    }
}
