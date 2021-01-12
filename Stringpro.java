import java.util.*;
class Stringpro
{
    public static void main(String[] args)
    {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("False"));
        list.add(Boolean.TRUE);
        System.out.print(list.size());
        System.out.print(list.get(1)instanceof Boolean);

    }
}