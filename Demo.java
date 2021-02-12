// interface i1
// {
//     void f1();// function declare
//     void f2();
interface i2
// {
//     void f1();// function declare
//     void f2();


// }
// class  A implements i1,i2
// {
//     public void f1()
//     {
//         System.out.println("hello");//function define
//     }
//     public void  f2()
//     {
//         System.out.println("hey");
        
//     }
// }
//    public class Demo
//     {
//       public static void main(String[] args) 
//       {
//           A obj=new A();//here i1 ka reference h lekin object create kr rhe h class A ka 
//           obj.f1();// function call
//           obj.f2();
    
//        }
//     }


abstract class person
{
   int name,age,contact;
}
class student
{
 int  marks,roll 
}
class employee extends person,student
{
 int empid ,sal,
}
public class Demo{
    public static void main(String[] args)
    {
        
        }
    }
}