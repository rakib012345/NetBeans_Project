
package capsul;

public class Students {
    	private String name;
	private int id;
        private String gender;
        private float cgpa;
        private String roll;
        private String cource;
        
        public void setcource(String cource)
        {
        this.cource= cource;
        }
        public String getcource()
        {
        return cource;
        }
        public void setname(String name)
	{
	this.name = name ;
	}
        public void setcgpa(float cgpa)
	{
	this.cgpa = cgpa ;
	}
       public void setgender(String gender)
	{
	this.gender = gender ;
	}
        public void setid(int id)
           {
           this.id = id ;
           }
        public String getname()
        {
            return name;
        }
        public String getgender()
        {
            return gender;
        }
        public int  getid()
        {
            return id;
        }
        public float  getcgpa()
        {
            return cgpa;
        }
        public void setroll(String roll)
        {
          this.roll = roll;
        }
        public String getroll()
        {
        
        return roll;
        }
        
}
