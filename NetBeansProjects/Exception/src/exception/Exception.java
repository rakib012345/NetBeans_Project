
package exception;


public class Exception {

  static void validate(int age){  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   } 
    
  void m()
    {  
      int data=50/0;  
    }    
 void n()
    {  
      m();  
    }
  void p(){  
   try{  
    n();  
   }catch(ArithmeticException e)
   {
       System.out.println("exception handeled");
   }  
  }  
    public static void main(String[] args) {
               
        Exception ob = new Exception();
        ob.p();
        
          validate(13);  
      System.out.println("rest of the code...");  
  }  
} 
