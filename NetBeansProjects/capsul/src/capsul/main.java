
package capsul;

public class main {
    
      public static void main (String[] args){
         Students obj = new Students();  
         Students obj1 = new Students();  
         obj.setname("Rakib");
         obj.setid(1);
         obj.setgender("male");
         obj.setcgpa(4);
         obj.setroll("12CSE042");
         obj.setcource("C++");
         obj1.setname("Jafor");
         obj1.setid(2);
         obj1.setgender("Female");
         obj1.setcgpa(3); 
         obj1.setroll("12CSE042");
         System.out.println("name: " + obj.getname()+"ID:"+obj.getid());
         System.out.println("Gender :" + obj.getgender());
         System.out.println("CGPA :" + obj.getcgpa());
         System.out.println("Roll :" + obj.getroll());
          System.out.println("Cource :" + obj.getcource());
         System.out.println("name: " + obj1.getname());
         System.out.println("ID :" + obj1.getid());
          System.out.println("Roll :" + obj1.getroll());
         System.out.println("Gender :" + obj1.getgender());
         System.out.println("CGPA :" + obj1.getcgpa());
       }
    
}
