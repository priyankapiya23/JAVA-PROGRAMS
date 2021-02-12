import java.util.*;
public class ArraysClass
{
    public static void main(String[] args)
    {
        int a[]={1,20,40,5,7,2,0,50};
        int i;
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+ " ");
        System.out.println();
        Arrays.sort(a,2,5);
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        Arrays.sort(a);

        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        Arrays.fill(a,7);
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        Arrays.fill(a,3,6,0);
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}