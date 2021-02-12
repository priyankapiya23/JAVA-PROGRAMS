import java.util.*;
class setexample1 //sorted set  and navigble set example
{
    public static void main(String[] args)
    {
        TreeSet t= new TreeSet(); // treeset class
        t.add("A");// this is method of collection interface and treeset implements the methods of collection of interface
        t.add("D");
        t.add("C");
        t.add("B");
        System.out.println(t);// insertion order is not sorted in set interface but using TreeSet we can find the ouput as sorted .
        System.out.println(t.last());//return sorted order's last element
        System.out.println(t.first());//return sorted order's first element
        System.out.println(t.headSet("B"));//return its previous element  B element
        System.out.println(t.tailSet("B"));//return its next element including  B element
        System.out.println(t.subSet("B","D"));//return subset including b and excluding d
        System.out.println(t.comparator());//returns the comparator used to order the elements in this set , or null if this set uses the natural ordering of its elements.
        //for number :ascending 
        //for string : dictionary

        // Navigableset
        System.out.println(t.ceiling("B"));
        System.out.println(t.ceiling("E"));
        System.out.println(t.floor("B"));
        System.out.println(t.floor("E"));
        System.out.println(t.higher("B"));
        System.out.println(t.lower("B"));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());



    }
}