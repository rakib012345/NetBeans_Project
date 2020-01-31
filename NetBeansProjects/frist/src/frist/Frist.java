
package frist;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frist extends JFrame{
    
    JFrame frame;
    JLabel l1;
    JButton b1;
    Frist () {
        frame = new JFrame("swing");
        l1 = new JLabel("hellow");
        b1 = new JButton("click");
        
        l1.setBounds(10,10,50,30);
        b1.setBounds(130,100,100,40);
        
        add(l1);
        add(b1);
        
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    

  
    public static void main(String[] args){
          new Frist ();
    }
    
    
}
