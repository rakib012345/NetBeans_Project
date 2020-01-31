
package hierarchy;

public class Staff extends Employee{
    private String Position;
    private int WorkingHour;
    
        public void setPosition(String Position)
	{
	this.Position=Position ;
	} 
        public void setWorkingHour(int WorkingHour)
	{
	this.WorkingHour=WorkingHour ;
	} 
    public String getPosition() 
	{
	return Position;
	}
    public int getWorkingHour() 
	{
	return WorkingHour;
	}

}
