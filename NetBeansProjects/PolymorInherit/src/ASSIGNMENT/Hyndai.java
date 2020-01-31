package ASSIGNMENT;

public class Hyndai extends CARS {
	
	public Hyndai()
	{
		System.out.println("CARS ARE SPEEDY\n");
		price = 0;
	}
	public Hyndai(int old)
	{
		price = old;
	}
  public int details() {
	  System.out.println("This is a CAR");
	  name = "Hyndai Speedy";
	  System.out.println("CAR : Hyndai\nName : "+name);
	  return price;
  }
  

}
