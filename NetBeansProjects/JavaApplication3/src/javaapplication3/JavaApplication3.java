
package javaapplication3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaApplication3 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Jlable tespramet ");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("First Name");

        l1.setFont(new Font("Courier New",Font.ITALIC+1, 14));
        l1.setForeground(Color.red);
        
        l1.setOpaque(true);
        l1.setBackground(Color.black);
        
        
        frame.add(l1);
        
        String htmlText =
                "<html><p><font colour=\"#800080\" "
                +"size =\"66\"face = \"Vardana\">HTML IN JLable</font></p>"
                + " <font size =\"6\"><u>"
                + " underline in posible</u><br><b> and bold too</b></font>"
                +"</html>";
        JLabel l2 = new JLabel(htmlText);
        frame.add(l2);
        frame.setSize(500,1000);
        frame.setVisible(true);
          
    }
    
}
