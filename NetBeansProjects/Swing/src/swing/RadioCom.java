
package swing;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class RadioCom extends TextF {
    
    JRadioButton r1,r2 ;
    JComboBox cb;
       RadioCom (){
            
                   String [] Country = {"bangladesh","india","Pakistan","Americca"};
                    r1 = new JRadioButton("male");
                    r2 = new JRadioButton("female");
                    cb = new JComboBox(Country);

                   r1.setBounds(250,50,80,30);
                   r2.setBounds(250,80,80,30);
                   cb.setBounds(300,400,150,50); 
                           
                   ButtonGroup bg = new ButtonGroup();
                   bg.add(r1);
                   bg.add(r2);

                   add(r1);
                   add(r2);
                   add(cb);
       
        setVisible(false);
       }
    
}
