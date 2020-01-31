package constructor;

public class Constructor {

    int id;  
    String name;  
    int age; 
    
    Constructor(int i,String n)
    {  
        id = i;  
        name = n;  
    }  
    Constructor(int i,String n,int a)
    {  
        id = i;  
        name = n;  
        age=a;  
    }  
    
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }  
   
    public static void main(String args[]){  
        Constructor s1 = new Constructor (111,"Karan");  
        Constructor s2 = new Constructor(222,"Aryan",25); 
        Constructor s3 = new Constructor (111,"Karan");
        s1.display();  
        s2.display(); 
        s3.display();
   }  
}
