
package encapsul;


public class Students {
    
	private String Name;
	private int Roll;
	private int Age;
        private int Id;
        private int Height;
        private int Cgpa;
        
	public int getId() 
	{
	return Id;
	}
	public int getAge() 
	{
	return Age;
	}
	public String getName() 
	{
	return Name;
	}
	public int getRoll() 
	{
	return Roll;
	}
	public int getHeight() 
	{
	return Height;
	}
 	public int getCgpa() 
	{
	return Cgpa;
	}           
        
	public void setAge( int Age)
	{
	   this.Age = Age;
	}

	public void setName(String Name)
	{
	this.Name=Name ;
	}

	public void setRoll( int Roll) 
	{
	this.Roll = Roll;
	}
	public void setHeight( int Roll) 
	{
	this.Height = Height;
	}
	public void setCgpa( int Roll) 
	{
	this.Cgpa = Cgpa;
	}        
	public void setId( int Roll) 
	{
	this.Id = Id;
	}         
        
        
     public static void main (String[] args) 
	{
		Students obj = new Students();
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
                obj.setHeight(7);
                obj.setId(1);
                obj.setCgpa(3);
		System.out.println("name: " + obj.getName());
		System.out.println("age: " + obj.getAge());
		System.out.println("roll: " + obj.getRoll()); 
	        System.out.println("height: " + obj.getHeight()); 
                System.out.println("ID: " + obj.getId()); 
                System.out.println("CGPA: " + obj.getCgpa()); 
                
   }
}
