import java.util.*;
public class Listiterator
{
    public static void main(String[] args)
     {
      LinkedList l= new LinkedList();
      l.add("c");
      l.add("java"); 
      l.add("php");
      l.add("python");
      System.out.println(l); 
      ListIterator lit = l.listIterator();
      while(lit.hasNext())
      {
          String s=(String)lit.next();
          if(s.equals("java"))
          lit.set("java se");
          else if(s.equals("c"))
          lit.add("ds");
          else if(s.equals("php"))
          lit.remove();
      }System.out.println(l);
    }
}