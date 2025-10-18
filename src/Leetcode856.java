public class Leetcode856 {
    public static void main(String[] args) {
        String s="()()";
        int re=parenthesis(s);
        System.out.println(re);

    }
    static int parenthesis(String s){
        char[] ch=s.toCharArray();
        int parent=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                parent++;
            }
        }
        return parent;
    }
}
