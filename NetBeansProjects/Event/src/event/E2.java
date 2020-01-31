
package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E2 extends JFrame implements ActionListener {
        JButton btn1,btn2;
        
        public E2 (){
         btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");
        
            setSize(300,200);
            setVisible(true);
            setLayout(new FlowLayout());
            getContentPane().add(btn1);
            getContentPane().add(btn2);
            
            btn1.addActionListener(this);
             btn2.addActionListener(this);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
  public static void main(String[] args){
        
         E2 r= new E2();
         r.setVisible(true);
  }
        
    public void actionPerformed(ActionEvent r) {
         if(r.getSource()==btn1)
         {
             System.out.println("hellow");
         }
        if(r.getSource()==btn2)
         {
             System.out.println("rakib");
         }
              
    }
    
}
