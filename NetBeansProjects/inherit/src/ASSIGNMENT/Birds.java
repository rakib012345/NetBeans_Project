
package ASSIGNMENT;

public class Birds extends animal {
	
	public Birds()
	{
		System.out.println("Birds are flying\n");
		age = 0;
	}
	public Birds(int old)
	{
		age = old;
	}
  public int details() {
	  System.out.println("This is a Bird");
	  name = "Crow";
	  System.out.println("Animal : BIRD\nName : "+name);
	  return age;
  }
  

}
