
package hrm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Add_Employee {
    public static void main(String[] args) {
        Add_Emploe obj3 = new Add_Emploe();
    }
}
class Add_Emploe extends JFrame implements ActionListener{

    JFrame frame;
    JLabel label1,label2,label3,label4,label5;
    JTextField nameField,birthDayD,birthDayM,birthDayY,contactInfo,designationField,
            salaryField;
    
  Add_Emploe(){ 
    initComponents();
    }

private void initComponents()
        {
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,900);
        this.setLocationRelativeTo(null);
        Font font1=new Font("f1",Font.BOLD+Font.ITALIC,16);

        
        JButton exit=new JButton("BACK");
        exit.setBounds(10,10,100,40);
        exit.setBackground(Color.CYAN);
        exit.setForeground(Color.PINK);
        exit.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                new Button();
                dispose();
            }
        });
        add(exit);
        
        label1=new JLabel("Enter employee name");
        label1.setBounds(40,100,300,50);
        label1.setForeground(Color.GREEN);
        label1.setFont(font1);
        add(label1);
        
        label2=new JLabel("Enter employee designation");
        label2.setBounds(440,100,300,50);
        label2.setForeground(Color.GREEN);
        label2.setFont(font1);
        add(label2);
        
        label3=new JLabel("Enter employee salary");
        label3.setBounds(840,100,300,50);
        label3.setForeground(Color.GREEN);
        label3.setFont(font1);
        add(label3);
        
        label4=new JLabel("Enter employee's birth day");
        label4.setBounds(40,300,300,50);
        label4.setForeground(Color.GREEN);
        label4.setFont(font1);
        add(label4);
        
        JLabel label5=new JLabel("Enter employee's contact info");
        label5.setBounds(440,300,300,50);
        label5.setForeground(Color.GREEN);
        label5.setFont(font1);
        add(label5);
        
        JTextField nameField=new JTextField();
        nameField.setBounds(40,200,200,50);
        nameField.setFont(font1);
        
        JTextField birthDayD=new JTextField("dd");
        birthDayD.setBounds(40,400,70,50);
        birthDayD.setFont(font1);
        add(birthDayD);
        
        JTextField birthDayM=new JTextField("mm");
        birthDayM.setBounds(130,400,70,50);
        birthDayM.setFont(font1);
        add(birthDayM);
        
        JTextField birthDayY=new JTextField("yy");
        birthDayY.setBounds(210,400,70,50);
        birthDayY.setFont(font1);
        add(birthDayY);
        
        JTextField contactInfo=new JTextField();
        contactInfo.setBounds(440,400,200,50);
        add(contactInfo);
       // nameField.setBackground(Color.GREEN);
       
        JTextField designationField=new JTextField();
        designationField.setBounds(440,200,200,50);
        designationField.setFont(font1);
      //  designationField.setBackground(Color.GREEN);
      
        JTextField salaryField=new JTextField();
        salaryField.setBounds(840,200,200,50);       
        salaryField.setFont(font1);
       // salaryField.setBackground(Color.GREEN);
       
        add(nameField);
        add(salaryField);
        add(designationField);
        JButton ok=new JButton("OK");
        ok.setBounds(40,500,80,40);
        add(ok);
       
        
                
        try {
            ImageIcon img = new ImageIcon("4.jpg");
            JLabel background;
            background = new JLabel("", img, JLabel.CENTER);
            background.setBounds(0,0,1200,900);
            add(background);
         } catch (Exception IOException) {
         }

        }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }




}