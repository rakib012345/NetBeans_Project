
package project_demo;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class HOME_PAGE extends JFrame  {
    JTextArea mainarea;
    public HOME_PAGE() {
         viewhome();  
    }
    
   private void viewhome (){
   
      setTitle ("");
      setSize(800,600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }  
    public static void main(String[] args) {
          HOME_PAGE hp = new HOME_PAGE();
    }
    
}
