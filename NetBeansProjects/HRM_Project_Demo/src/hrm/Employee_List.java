
package hrm;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;


public class Employee_List {
    
    public static void main(String[] args) {
        Employee obj2 = new Employee();
    }
    
}
class Employee extends JFrame implements ActionListener{


 public Employee() {
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,900);
        this.setLocationRelativeTo(null);
        
        JButton exit=new JButton("BACK");
        exit.setBounds(10,10,100,40);
        exit.setBackground(Color.GREEN);
        exit.setForeground(Color.red);
        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new Button();
                dispose();
            }
        });
        
        ScrollPane sp=new ScrollPane();
        
        JTable tab=new JTable(100,7);
        tab.setValueAt("ID:",0,0);
        tab.setValueAt("NAME",0,1);
        tab.setValueAt("DESIDNATION",0,2);
        tab.setValueAt("SALARY",0,3);
        tab.setValueAt("PERFORMENCE",0,4);
        tab.setValueAt("BIRTH DAY",0,5);
        tab.setValueAt("JOINING DAY",0,6);
        //tab.setValueAt("CONTACT INFO",0,7);
        tab.setRowHeight(50);
      //  read(tab,"EMPLOYEE_LIST.txt");
        JLabel pageTitle=new JLabel("MSS's EMPLOYEE");
        pageTitle.setBackground(Color.YELLOW);
        pageTitle.setBounds(200, 10,400, 80);
        sp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sp.add(tab);
        sp.setBounds(0, 100,1150, 500);

        add(pageTitle);
        add(sp);
        add(exit);
        setBackground(Color.PINK);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }




}
