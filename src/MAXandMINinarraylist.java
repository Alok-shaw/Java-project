import java.util.ArrayList;
import java.util.List;

public class MAXandMINinarraylist {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        li.add(1);
        li.add(12);
        li.add(14);
        li.add(15);
        li.add(165);
        li.add(15);
        li.add(-165);
        li.add(77);
        li.add(167);
        li.add(13);
        li.add(154);
        li.add(65);
        li.add(155);
        li.add(96);
        li.add(85);


        l1.add(6);
        l1.add(63);
        l1.add(6);
        l1.add(54);
        l1.add(55);
        l1.add(56);
        l1.add(5);
        l1.add(6);
        l1.add(56);
        l1.add(5);
        l1.add(65);
        l1.add(53);
        l1.add(45);
        l1.add(98);
        l1.add(978);

       // l1.addAll(li);   // merge two arraylist using in-built function addAll(this method add both arraylist into int one)
      //  System.out.println(l1);

      //  l1.retainAll(li); retainAll method give the only common element from both arraylist like intersection
       // System.out.println(l1);

        int max=li.get(0);
        int min=li.get(0);
        for(int i=0;i<li.size();i++){
            if(li.get(i)>max){
                max=li.get(i);
            }
            if(li.get(i)<min){
                min=li.get(i);
            }
        }
        System.out.println("maximum "+ max);
        System.out.println("minimum "+ min);


    }
}
