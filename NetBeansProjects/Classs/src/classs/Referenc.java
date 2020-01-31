
package classs;

class Referece{  
    int id;  
    String name;  
}  
class TestStudent3{  
 public static void main(String args[]){  
  //Creating objects  
  Referece s1=new Referece();  
  Referece s2=new Referece();  
  //Initializing objects  
  s1.id=101;  
  s1.name="Sonoo";  
  s2.id=102;  
  s2.name="Amit";  
  //Printing data  
  System.out.println(s1.id+" "+s1.name);  
  System.out.println(s2.id+" "+s2.name);  
 }  
}
