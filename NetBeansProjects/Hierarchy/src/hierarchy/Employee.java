
package hierarchy;

public class Employee extends Person{

          private String employeeID;
           private  double salary;
    public void setemployeeID(String employeeID)
	{
	this.employeeID=employeeID ;
	}  
    public void setsalary(double salary)
	{
	this.salary=salary ;
	} 
    public String getemployeeID() 
	{
	return employeeID;
	}
    public double getsalary() 
	{
	return salary;
	}
}
    
