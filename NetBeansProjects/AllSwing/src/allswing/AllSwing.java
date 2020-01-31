
package allswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AllSwing extends JFrame implements ActionListener{
    
    JFrame frame;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2,b3;
    JTextField f1,f2,f3,f4,f5,f6;
    JTextArea t1;
    JRadioButton r1,r2;
    JComboBox cb;

   public AllSwing(){       
           frame = new JFrame();
           String [] Occupation = {"Police","Teacher","Bankker","Thief"};
      
           l1 = new JLabel("Name");
           l2 = new JLabel("Phone");
           l3 = new JLabel("Email Address");
           l4 = new JLabel("Address");
           l5 = new JLabel("Sex");
           l6 = new JLabel("Occupation");

           b1 = new JButton("Submit");
           b2 = new JButton("Cancell");

           f1 = new JTextField("your name");
           f2 = new JTextField("your phone Number");      
           f3 = new JTextField("What Email.....???");
           f4 = new JTextField("Sex");
           

           t1 = new JTextArea("Write SomeThing here");
           r1 = new JRadioButton("Male");
           r2 = new JRadioButton("Female");
           cb = new JComboBox(Occupation);
           
           l1.setBounds(10,20,50,20);
           f1.setBounds(100, 20, 100, 20);
           
           l2.setBounds(10,50,50,20);
           f2.setBounds(100,50, 100, 20);
            
           l3.setBounds(10,100,50,20);
           f3.setBounds(100,100, 100, 20);
           
           l4.setBounds(10,140,50,20);
           t1.setBounds(150,140, 100, 100);
           
           l5.setBounds(10,250,50,20);
           r1.setBounds(100,250, 50, 50);
           r1.setBounds(200,250, 50, 50);
           
           l6.setBounds(10,270,120,20);
           cb.setBounds(150,270, 100, 30);
           
           b1.setBounds(10,350,90,20);
           
           b2.setBounds(140,350,130,20);
 
            add(l1);
            add(l2);
            add(l3);
            add(l4);
            add(l5);
            add(l6);
            add(b1);
            add(b2);
            add(f1);
            add(f2);
            add(f3);
            add(f4);
            add(t1);
            add(r1);
            add(r2);
            add(cb);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
          
            setVisible(true);
            setSize(800,800);
            setTitle("Swing");
            setLayout(null);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }
    public static void main(String[] args) {
           
            new AllSwing(); 
     

    }
      public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            JOptionPane.showMessageDialog(rootPane, "hi");
        }
          if(e.getSource()==b2){
            JOptionPane.showConfirmDialog(rootPane, "fuck you man");
        }
    }
    
} 

