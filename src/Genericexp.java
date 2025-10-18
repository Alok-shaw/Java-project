import java.util.HashMap;
import java.util.Map;

public class Genericexp {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"mathematics");

    }
}

class generic{
   private int bookid;
   private String booktitle;
    generic(int bookid,String booktitle){
        this.bookid=bookid;
        this.booktitle=booktitle;
    }
    void show(){
        System.out.println(bookid+" "+booktitle);
    }

}