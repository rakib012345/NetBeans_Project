
package excep6;

class Excep6{  
 public static void main(String args[]){  
  try{  
        try{  
            System.out.println("going to divide");  
            int b =39/0;  
        }
    catch(ArithmeticException e){
        System.out.println(e);
        e.printStackTrace();
    }  
   
        try{  
            int a[]=new int[5];  
            a[5]=4;  
        }
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }  
  }
  catch(Exception e){
      System.out.println("handeled");
  }  
  
  System.out.println("normal flow..");  
 }  
} 