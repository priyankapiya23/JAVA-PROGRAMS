public class JavaExceptionExample{  
    public static void main(String args[]){  

      validate(13);  
    System.out.println("rest of the code...");  

     try{  
        //code that may raise exception  
        int data=100/0;  
     }catch(ArithmeticException e)
     
     {System.out.println("Arithematic exception");}  
     //rest code of the program   
     System.out.println("rest of the code...");  

     try{    
      int a[]=new int[5];    
      a[5]=30/0;    
     }    
     catch(Exception e){System.out.println("common task completed");}    
   //   catch(ArithmeticException e){System.out.println("task1 is completed");}  // throw compile time error because if parent calss called first than we cant call subclass  
   //   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
   //   System.out.println("rest of the code...");    



     try{  
      try{  
       System.out.println("going to divide");  
       int b =39/0;  
      }catch(ArithmeticException e){System.out.println(e);}  
     
      try{  
      int a[]=new int[5];  
      a[5]=4;  
      }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
       
      System.out.println("other statement");  }
    catch(Exception e){System.out.println("handeled");}  
    
    System.out.println("normal flow..");

    try{  
      int data=25/0;  
      System.out.println(data);  
     }  
     catch(ArithmeticException e){System.out.println(e);}  
     finally{System.out.println("finally block is always executed");}  
     System.out.println("rest of the code...");  


    //Rule: For each try block there can be zero or more catch blocks, but only one finally block.
//Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
    



static void validate(int age)
{  
   if(age<18)  
    throw new ArithmeticException("not valid");  
   else  
    System.out.println("welcome to vote");  
 } 
   
    
 
    
    }  
  }  