public class Leetcode387 {
    public static void main(String[] args) {
        String n="aaaaaijjjwwss";
       // System.out.println(n.length());
        int r=first(n);
        System.out.println(r);

    }
    static int first(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int c=0;
            for(int j=0;j<ch.length;j++){
                if(i!=j) {
                    if (ch[i] == ch[j]) {
                        c++;
                    }
                }
            }
            if(c==0){
                return i;
            }
        }
        return -1;
    }
}
