package ASSIGNMENT;

public class Maintester{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal  b = new Birds(25);
		System.out.println("AGE : "+b.details()+"\n");
		Person p = new Pranta(20);
		System.out.println("AGE : "+p.details()+"\n");
		CARS c1 = new Hyndai(25000);
		System.out.println("Price : "+c1.details()+"\n");
		CARS c2 = new Tata(15000);
		System.out.println("Price : "+c2.details()+"\n");
	}


}
