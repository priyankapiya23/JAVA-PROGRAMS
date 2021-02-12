import java.util.*;

public class StackClassExample {
    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
        s.add("Piya");
        s.add("suman");
        Iterator<String> itr=s.iterator();
        while(itr.hasNext())
        {
              System.out.println(itr.next());
        }
    }
    
}
