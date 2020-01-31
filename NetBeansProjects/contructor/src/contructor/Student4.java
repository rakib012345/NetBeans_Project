
package contructor;

public class Student4 {
	int id;  
	String name;
        int age;
        String home;
	      
  Student4(int i,String n)
    {  
        id = i;  
       name = n;  
    }  
  Student4(int i,String n,int a)
	 {  
	      id = i;  
              name = n; 
              age = a;
         }
    
  Student4(int i,String n,int a,String hom)        
        {
              id = i;  
              name = n; 
              age = a;
              home = hom;
         }  
        
  void display(){System.out.println(id+" "+name+" "+age+""+home);}  
	   
	    public static void main(String args[])
	    {  
	    Student4 s1 = new Student4(111,"Karan");  
	    Student4 s2 = new Student4(222,"Aryan",12);  
            Student4 s3 = new Student4(222,"Aryan",12 ," bhola");
	    s1.display();  
	    s2.display(); 
            s3.display(); 
	   } 
    
}
