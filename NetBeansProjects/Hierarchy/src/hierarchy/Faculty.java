
package hierarchy;

public class Faculty extends Employee{
    
    private String GovtSector;
    private String PrivateSector;
        public void setGovtSector(String GovtSector)
	{
	this.GovtSector=GovtSector ;
	} 
     public void setPrivateSector(String PrivateSector)
	{
	this.PrivateSector=PrivateSector ;
	}
    public String getGovtSector() 
	{
	return GovtSector;
	}
    public String getPrivateSector() 
	{
	return PrivateSector;
	}
}
