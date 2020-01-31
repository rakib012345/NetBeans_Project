
package hierarchy;

public class Graduate extends Student {
    private String sub;
    private String Goal;
    
   public void setsub(String sub)
   {
   this.sub=sub;
   }
   public void setGoal(String Goal)
   {
   this.Goal=Goal;
   }
   public String getsub()
   {
   return sub;
   }
   public String getGoal()
   {
   return Goal;
   }
}
