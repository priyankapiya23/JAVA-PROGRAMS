import java.util.*;
public class collectionsclassexample
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(10);
        v.add(250);
        System.out.println(v);
        Collections.sort(v);


        int x=Collections.binarySearch(v,30) ;
        System.out.println(v);
        System.out.println(x);
        Collections.swap(v,1,3);
        System.out.println(v);
    }
}