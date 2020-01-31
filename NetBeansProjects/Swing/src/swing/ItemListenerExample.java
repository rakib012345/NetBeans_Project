
package swing;

import java.awt.*;    
import java.awt.event.*;    
public class ItemListenerExample extends RadioCom implements ItemListener{    
    Checkbox checkBox1,checkBox2;  
    Label label;  
    ItemListenerExample(){     
        checkBox1 = new Checkbox("C++");    
        checkBox1.setBounds(10,250, 50,50);    
        checkBox2 = new Checkbox("Java");    
        checkBox2.setBounds(90,250, 50,50);    
        add(checkBox1); add(checkBox2); add(label);    
        checkBox1.addItemListener(this);    
        checkBox2.addItemListener(this);     
        setLayout(null);    
        setVisible(true);    
        setVisible(false);
     }    
    public void itemStateChanged(ItemEvent e) {      
        if(e.getSource()==checkBox1)  
            label.setText("C++ Checkbox: "     
            + (e.getStateChange()==1?"checked":"unchecked"));   
        if(e.getSource()==checkBox2)  
        label.setText("Java Checkbox: "     
        + (e.getStateChange()==1?"checked":"unchecked"));    
     }  
 
}   
