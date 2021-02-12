import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("piya");
        al.add("suman");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
