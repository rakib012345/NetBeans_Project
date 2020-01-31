
package hierarchy;

public class Student extends Person{
      private String address;
      private String id;
      
      public void setaddress(String address)
	{
	this.address=address ;
	}
      public void setid(String id)
	{
	this.id=id ;
	}
    public String getaddress() 
	{
	return address;
	}
     public String getid() 
	{
	return id;
	}
}
