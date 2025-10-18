import java.util.*;
public class AllaboutArraylist {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        List<Integer> li1=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        li.add(10);
        li1.add(1);
        li1.add(1);
        li1.add(1);
        li1.add(4);
        li1.add(812);
        li1.add(6);
        li1.add(67);
        li1.add(86);
        li1.add(67);
        li1.add(5);
       // li.remove(3);               // remove method use to delete any element at specific index number


      //  li.set(0,1);                     // set method set the value at specific index position like here 0 is the index position and value is 1
        System.out.println(li);

        System.out.println(li.get(1));  // get(1) give index position  1 value

        //System.out.println(li.size());    // size method return the size of list(total number of element in the list or arraylist)

        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(20);
        l1.add(40);
        l1.add(50);

//        List<Integer> li2=new ArrayList<>();
//        li2=(ArrayList<Integer>) l.clone();  clone method give the shallow copy of l arraylist(here l is a other array


        //System.out.println(l.contains(2)); contain method find the element in the entire
        //  arraylist if find it then give result true otherwise false (in this case for element 2 is false because arraylist l does not contain 2)

        // System.out.println(l.retainAll(l1));  // retainall method work like a intersection
        // System.out.println(l1);

        // l.removeAll(l1);     removeall method work like a differnece between two set like A-B
        // System.out.println(l);

        //li.addAll(li1);  addAll method add all element of both list but not remove duplicates
        // System.out.println(li);

//       boolean f= li.containsAll(li1); containAll method check li1 all elements are(one thing you must remember every list contain itself so result is everytime will be true)
//        System.out.println(f);       present in the li if li contain all element of li1 then the result is true otherwise false

          //l.clear(); clear method,remove all the element from the list or arraylist

        // now we will discuss about key feature of arraylist
        // (1) the size of arraylist does'n fix mean the size of arraylist will be grow or shrink automatically when the element are delete or add
        // (2) list or arraylist maintain the insertion order
        // (3) duplicate allow in the  list or arraylist as well null value also
        // (4) random access in list is very fast because they store element in the contigous
        // (5) arraylist are not synchronized must be do manually for multithreading
    }
}
