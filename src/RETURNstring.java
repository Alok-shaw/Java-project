public class RETURNstring {
    public static void main(String[] args) {
        String a1="hello";
        char[] r1=a1.toCharArray();
        String a2="ll";
        System.out.println(a2.length());
        char[] r2=a2.toCharArray();
        int c=0;
        for(int i=0;i<a1.length();i++){
            for(int j=i;j<a2.length();j++){
                if(r1[i]==r2[j]){
                    c++;
                    break;
                }
            }
        }

    }
}
