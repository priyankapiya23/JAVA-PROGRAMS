import java.util.*;
public class HashsetExample
{
    public static void main(String[] args)
    {
        HashSet h=new HashSet();
        h.add("one");
        h.add("two");
        h.add("three");
        h.add("four");
        h.add("one");//dublicates not allowed
        System.out.println(h);// order are not preserved in HashSet
        LinkedHashSet s=new LinkedHashSet();
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("one");//dublicates not allowed
        System.out.println(s);//order are preserved in LinkedhashSet 
    }
}