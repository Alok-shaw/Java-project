public class Leetcode125 {
    public static void main(String[] args) {
       boolean re= palidrome("A man, a plan, a canal: Panama");
        System.out.println(re);

    }
    static boolean palidrome(String str){
        String s = str.trim().toLowerCase();
        // Step 2: Replace multiple spaces, semicolon and colon with single space
        s = s.replaceAll("[;:,]", "");     // ; aur : ko space se replace kar do
        s = s.replaceAll("\\s+", "");// multiple spaces ko ek space me kar do
        char ch[]=s.toCharArray();
        for(int i=0;i<(ch.length)/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        String pa=String.copyValueOf(ch);
        System.out.println(pa);
        if(s.compareTo(pa)==0){
            return true;
        }
        else {
            return false;
        }

    }
}
