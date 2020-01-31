package ASSIGNMENT;

public class Tata extends CARS {
	
	public Tata()
	{
		System.out.println("CARS ARE SPEEDY\n");
		price = 0;
	}
	public Tata(int old)
	{
		price = old;
	}
  public int details() {
	  System.out.println("This is a CAR");
	  name = "Tata Nano";
	  System.out.println("CAR : Tata\nName : "+name);
	  return price;
  }
  

}
