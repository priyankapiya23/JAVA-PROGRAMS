import java.util.*;

public class vectorexample {
    public static void main(String args[]) {
        Vector<String> v= new Vector<String>();
        v.add("piya");
        v.add("suman");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
