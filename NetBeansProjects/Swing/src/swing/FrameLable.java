
package swing;

import com.sun.glass.ui.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class FrameLable extends JFrame implements ActionListener{
   JLabel l1,l2,l3,l4;
   JFrame frame ;
   JRadioButton r1,r2;
   JButton b1,b2;
   FrameLable ()
   {
            frame = new JFrame();
            l1 = new JLabel("Create Your Google Acconut");
            l2 = new JLabel("you can use letter & number ");
            l3 = new JLabel("Use my current emil address insteads");
            l4 = new JLabel("sing in insted");
            
            b1 = new JButton("OK");
            b2 = new JButton("Cancel");
            
            l1.setBounds(10,20,200,30);
            l2.setBounds(10,250,2500,30);
            l3.setBounds(10,300,250,30);
            l4.setBounds(10,370,250,30);
            b1.setBounds(10,400,60,50);
            b2.setBounds(90,400,80,50);
            
        
             add(l1);  
             add(l2);  
             add(l3);  
             add(l4); 
             add(b1);
             add(b2);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            
            
            setSize(700, 500);
            setTitle("Google desing");
            setLayout(null);
            setVisible(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            

            
           
   }
 
      public static void main(String[] args) {
      new FrameLable();
      TextF bal = new TextF();
      bal.setVisible(true);
      RadioCom cal = new RadioCom();
      cal.setVisible(true);
      JmenuExample menu = new JmenuExample();
      menu.setVisible(true);
      MouseListenerExample Mouse = new MouseListenerExample();
      Mouse.setVisible(true);
      ItemListenerExample Item =  new ItemListenerExample(); 
      Item.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            JOptionPane.showMessageDialog(rootPane, "hi");
        }
          if(e.getSource()==b2){
            JOptionPane.showConfirmDialog(rootPane, "fuck you man");
        }
    }
    
}
