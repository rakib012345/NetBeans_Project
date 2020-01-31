
package copyconstructor;

class Students6{  
    int id;  
    String name;  
    int age;
   Students6(int i,String n,int a){  
    id = i;  
    name = n;  
    age = a;
    }  

    Students6(Students6 r){  
    id = r.id;  
    name = r.name;  
    age = r.age;
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Students6 s1 = new Students6(111,"Karan",40);  
    Students6 s2 = new Students6(s1);  
    s1.display();  
    s2.display();  
   }  
}  