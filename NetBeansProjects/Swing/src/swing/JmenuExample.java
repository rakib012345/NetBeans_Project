
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class JmenuExample extends RadioCom implements ActionListener{
    
    JMenuBar bar;
    JMenu menu1,menu2,menu3,menu4;
    JMenuItem item1,item2,item3,item4;
    
    public JmenuExample(){
      bar = new JMenuBar();
      menu1 = new JMenu("File");
      menu2 = new JMenu("Entry");
      menu3 = new JMenu("Help");
      menu4 = new JMenu("Quite");
      
      item1 = new JMenuItem("exit");
      item2 = new JMenuItem("new");
      item3 = new JMenuItem("open");
      item4 = new JMenuItem("about");
      
      menu1.add(item1);
      menu1.add(item3);
      menu2.add(item2);
      menu3.add(item4);
      menu2.add(menu3);
      bar.add(menu1);
      bar.add(menu2);
      bar.add(menu3);
      bar.add(menu4);
      
      item1.addActionListener(this);
      item3.addActionListener(this);
      add(bar);
      setVisible(false);
      bar.setBounds(100,5, 200, 20);
    
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
               if(e1.getSource()==item1){
            JOptionPane.showMessageDialog(rootPane, "Do you want");
        }
               if(e1.getSource()==item3){
            JOptionPane.showMessageDialog(rootPane, "plz open");
        }          
    }
    
}
