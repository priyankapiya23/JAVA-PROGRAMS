class Stringexample
{
    public static void main(String[] args)
    {
        String s1="priyanka";
        String s2="PRiyanka";// s1 and s2 has same obejct
        String s3=new String("priyanka");// this is other object because it is created using new 
        System.out.println("ans1:"+(s1==s2));//compares reference
        System.out.println("ans2:"+s1.equals(s2));//compare objects
        System.out.println("ans3:"+(s1==s3));//compare reference so it return false
        System.out.println("ans4:"+s1.equals(s3));//compares obejct and this is euals 
        System.out.println(s1);
        s1.toUpperCase();
        System.out.println("ans5 is "+s1.equalsIgnoreCase(s2));
        //System.out.println(s2);
        System.out.println(s1);// print same as string value so that we have to ceate a new object
        String s4 =s1.toUpperCase();
        System.out.println(s4);
        String s5 =s1.toLowerCase();
        System.out.println(s5);
        int i = s5.indexOf('a');
        System.out.println(i);
        int j = s5.indexOf('a',3);//search from index 3
        //compare
        String s6 = "amit";
        String s7 ="amit";
        int k=s6.compareTo(s7);
        System.out.println(j);
        if(k==0)
        System.out.println("string are same");
        if(k>0)
        System.out.println("opposite to dictionary order");
        else 
        System.out.println("dictinory order");
        String s9= s1.substring(2,4);
        System.out.println(s9);




        
    }
}