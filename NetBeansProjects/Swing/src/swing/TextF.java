
package swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextF extends FrameLable{
    
    JTextField tf1,tf2,tf3;
    
    TextF()
    {
          
        tf1 = new JTextField("First Name");
        tf2 = new JTextField("Last Name");
        tf3 = new JTextField("User Name  @gmail.com");
        
        tf1.setBounds(10,50,80,30);
        tf2.setBounds(110,50,80,30);
        tf3.setBounds(10,150,250,30);
        
        add(tf1);
        add(tf2);
        add(tf3);
       setVisible(false);
       }
  }

    
