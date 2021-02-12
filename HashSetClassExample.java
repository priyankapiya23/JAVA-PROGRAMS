import java.util.*;
public class HashSetClassExample {

    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("name");
        h.add("roll");
        Iterator it =h.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
