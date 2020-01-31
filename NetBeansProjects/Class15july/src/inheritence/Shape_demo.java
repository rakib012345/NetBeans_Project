package inheritence;


public abstract class Shape_demo {
	private double length;
	public double getArea(double length){
		return length*length;
	}
	public double getArea(double height, double width)
	{
		return 0.5*height*width;
	}
	public double getArea1(double rheight, double rwidth)
	{
		return rheight*rwidth;
	}


}
