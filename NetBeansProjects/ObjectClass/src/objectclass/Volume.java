
package objectclass;

public class Volume {
   int length,height,weight;
   String name;
  void recVolume(int l,int h,int w,String n )
    {
      height=h;
      weight=w;
      length =l;
      name= n;
    }
  void displayInformation(){System.out.println(length+" "+height+" "+name);}  
}
class testVolume {
     public static void main(String[] args) {
             Volume rectan = new Volume();
             Volume circle = new Volume();
             rectan.recVolume(1,3,4,"rectan");  
             circle.recVolume(1,2,3,"circle");  
             rectan.displayInformation();  
             rectan.displayInformation();  
       }
       
    
   
}
