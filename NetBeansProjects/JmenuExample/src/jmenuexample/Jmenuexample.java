
package jmenuexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Jmenuexample extends JFrame implements ActionListener{
    
    JMenuBar bar;
    JMenu mu1,mu2,mu3,mu4;
    JMenuItem item1,item2,item3,item4;
    
    Jmenuexample(){
    
       bar = new JMenuBar();
       mu1 = new JMenu("File");
       mu2 = new JMenu("Entry");
       mu3 = new JMenu("Help");
       mu4 = new JMenu("Quit");
       item1 = new JMenuItem("Exit");
       item2 = new JMenuItem("new");
       item3 = new JMenuItem("Open");
       item4 = new JMenuItem("About");
       //item1.setAccelerator(java.swing.KeyStroke(java.awt.KeyEventDispatcher.VK_X,java.awt.event.InputEvent.CTRL_MASK));
       
       mu1.add(item1);
       mu1.add(item3);
       mu2.add(item2);
       mu3.add(item4);
       mu2.add(mu3);
       bar.add(mu1);
       bar.add(mu2);
       bar.add(mu4);
        setJMenuBar(bar);
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
       
     mu4.addMouseListener(new MouseAdapter() {
            public void MouseClicked (MouseAdapter e)
         {
            int x= JOptionPane.showConfirmDialog(rootPane, "are you Sure?", "Conform ",JOptionPane.OK_CANCEL_OPTION );
            if (x==0)
            {
                System.out.println("x");
                System.exit(0); 
            }
         }
           
});
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e.getSource()==item1){ 
            int x= JOptionPane.showConfirmDialog(this, "are you Sure?", "Conform ",JOptionPane.OK_CANCEL_OPTION );
            if (x==0){
                System.out.println("x");
                System.exit(0); 
            }else{
            }
       }
       
       if (e.getSource()==item2){
          NewJFrame jf = new NewJFrame();
           jf.setVisible(true);
       }
    }
    
       public static void main(String[] args){
         new Jmenuexample ();
    }
    
    }

