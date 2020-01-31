
package ASSIGNMENT;


public class Pranta extends Person {
	
	public Pranta()
	{
		System.out.println("Person has mind to determine\n");
		age = 0;
	}
	public Pranta(int old)
	{
		age = old;
	}
  public int details() {
	  System.out.println("This is a Person");
	  name = "PRANTA KUMAR BISWAS";
	  System.out.println("Animal : Person\nName : "+name);
	  return age;
  }
  

}
