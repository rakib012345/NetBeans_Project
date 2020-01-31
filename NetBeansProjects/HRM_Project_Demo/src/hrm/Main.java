
package hrm;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {
    
    public static void main(String[] args) {
       Button obj1 = new Button();
       obj1.setVisible(true);
               
    }
}
 class Button extends JFrame{
   
     public Button ()
     {
     
        this.setVisible(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,900);
        this.setLocationRelativeTo(null);
        this.setTitle("Human Resource Management System");
        Font font = new Font("Arial",Font.BOLD,26);

         try {
            ImageIcon img = new ImageIcon("3.jpg");
            JLabel background;
            background = new JLabel("", img, JLabel.CENTER);
            background.setBounds(0,0,1200,900);
            add(background);
         } catch (Exception IOException) {
         }


        JButton ListButton  = new JButton("Employee List");
        JButton AddButton  = new JButton("Add Employee");
        JButton RemoveButton  = new JButton("Remove Employee");
        JButton UpdateButton = new JButton("Update Employee");
        JButton ViewButton = new JButton("View Attendence");
        
        ListButton.setBounds(50,100,350,40);
        ListButton.setFont(font);
        ListButton.setBackground(Color.BLACK);
        ListButton.setForeground(Color.RED);
        add(ListButton);
        
        ListButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new Employee();
            }
        });
        
        AddButton.setBounds(50,200,350,40);
        AddButton.setFont(font);
        AddButton.setBackground(Color.BLACK);
        AddButton.setForeground(Color.YELLOW);
        add(AddButton);
        
        AddButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new Add_Emploe();
               
            }
        });  
        
        RemoveButton.setBounds(50,300,350,40);
        RemoveButton.setFont(font);
        RemoveButton.setBackground(Color.BLACK);
        RemoveButton.setForeground(Color.GREEN);
        add(RemoveButton);
        
        RemoveButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new Remove_Employee();
                     
            }
        });
 
        
        UpdateButton.setBounds(50,400,350,40);
        UpdateButton.setFont(font);
        UpdateButton.setBackground(Color.BLACK);
        UpdateButton.setForeground(Color.WHITE);
        add(UpdateButton);
        
        UpdateButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new Update_Employ();
             
            }
        });        
 
        ViewButton.setBounds(50,500,350,40);
        ViewButton.setFont(font);
        ViewButton.setBackground(Color.BLACK);
        ViewButton.setForeground(Color.BLUE);
        add(ViewButton);
        
        ViewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new View_Attendence();
                
            }
        }); 

        
     }
}

