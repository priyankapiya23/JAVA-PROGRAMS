import java.util.*;
public class QueueInterfaceExample {
    public static void main(String[] args) {
        PriorityQueue<String> p=new PriorityQueue<String>();
        p.add("piya");
        p.add("riya");
        p.add("ansuman");
        p.add("priya");
        System.out.println("head"+p.element());
        System.out.println("head"+p.peek());

        Iterator itr=p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        p.remove();
        p.poll();
        System.out.println("after removing");
        Iterator itr2=p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr2.next());
        }
    }

    
}
