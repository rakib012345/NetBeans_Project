package inheritence;

public class Mainfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_demo c = new Circle();
		c.getArea(10);
		System.out.println(c.getArea(10));
		Shape_demo s = new Square();
		System.out.println(s.getArea(10));
		c=s;
		System.out.println(c.getArea(10));
		Shape_demo t = new Triangle();
		System.out.println(t.getArea(10,10));
		Shape_demo u = new Rectangle();
		System.out.println(u.getArea(10,10));

	}

}
