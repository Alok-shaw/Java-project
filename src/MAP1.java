import java.util.*;

public class MAP1 {
    public static void main(String[] args) {
        Map<Integer,String > obj=new HashMap<>();
        obj.put(null,"Alok shaw");  // only one null key value will be allowed in map others ignore as well not duplicate allowed
        obj.put(null,"alok");
        obj.put(1,"Dubey gupta");
        System.out.println(obj);

        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for(int i=1;i<=10;i++){
            list.add(i);
            set.add(i);
        }
        System.out.print("list interface element->");
        for(int i=1;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.print("set interface elements->");
        for (int a :set){
            System.out.print(a+" ");
        }
    }
}
