
package encapsul1;

public class Main {
    
     public static void main (String[] args){
     Bus parado = new Bus();
     parado.setname("Parado");
     parado.setcolor("black"); 
     parado.setprice(100);
     
    System.out.println("name: " + parado.getname());
    System.out.println("color: " + parado.getcolor());
    System.out.println("price: " + parado.getprice());
    
     } 
}
