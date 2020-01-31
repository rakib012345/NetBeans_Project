
package caltivates;


public class Cow extends Dairy {
      private String Name;
      private int rate;
      
      public void setName(String Name)
	{
	this.Name=Name ;
	}
       public void setrate(int rate)
	{
	this.rate=rate ;
	}
       public String getName() 
	{
	return Name;
	}
       public int getrate() 
	{
	return rate;
	}
}
