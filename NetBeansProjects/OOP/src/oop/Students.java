
package oop;

public class Students {
    int id;
    String name;
    String Session;
    String department;
    int age;
    
    void insert(int card,String n,String s,String d,int a){
        id = card;
        name = n;
        Session = s;
        department = d;
        age = a;
     }
  void display(){System.out.println(id+" "+name+" "+Session+" "+department+" "+age);} 

    public static void main(String[]arg){
    
    Students s1 = new Students();
    Students s2 = new Students();
    Students s3 = new Students();
    
    s1.insert(036,"rakib", "2016-2017", "English", 23);
    s2.insert(036,"sawn", "2016-2017", "CSE", 22);
    s3.insert(036,"jafor", "2016-2017", "Bangla", 20);
    s1.display();
    s2.display();
    s3.display();
    }
}
