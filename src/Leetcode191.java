public class Leetcode191 {
    public static void main(String[] args) {
        int result=count(10);
        System.out.println(result);

    }
    static int count(int a){
        String str=Integer.toBinaryString(a);
        char[] ch=str.toCharArray();
        int c=0;
        for(char chr : ch){
            if(chr=='1'){
                c++;
            }
        }
        return c;
    }
}
