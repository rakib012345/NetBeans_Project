
package hierarchy;

public class Undergraduate extends Student{
    
    private String Studies;
    private int credit;
    
    public void setStudies(String Studies)
    {
    this.Studies=Studies;
    }
    public void setcredit(int credit)
    {
    this.credit=credit;
    }
    public String getStudies()
    {
    return Studies;
    }
    public int getcredit()
    {
    return credit;
    }

}
