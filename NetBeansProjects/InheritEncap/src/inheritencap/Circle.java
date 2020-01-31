
package inheritencap;


public class Circle extends Shape{
	final private double PI = 3.1416;
    @Override
    public double getArea(double radius){
    	return PI*radius*radius;
    }

}
    
