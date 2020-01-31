
package cutivate;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Main {
    public static void main(String[] args) {
        Button obj1 = new Button();
    
    }
}
class Button extends JFrame{


  public Button()
  {
        JButton b  = new JButton("Crops");
        JButton b1  = new JButton("Fishes");
        JButton b2  = new JButton("Dairy");
        JButton b3 = new JButton("Back");
       
        Font font = new Font("Arial",Font.BOLD,26);
        Font font1 = new Font("Arial",Font.BOLD,16);
        
        b.setBounds(300, 100,300, 50);
        b.setBackground(Color.green);
        b.setFont(font);
        add(b);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new cropstable();
                   dispose();
            }
        });
        
        b1.setBounds(300, 200, 300, 50);
        b1.setBackground(Color.red);
        b1.setFont(font);
        add(b1);
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new FishesTable();
                   dispose();
            }
        });

        b2.setBounds(300, 300, 300, 50);
        b2.setBackground(Color.blue);
        b2.setFont(font);
        add(b2);
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new DairyTable();
                   dispose();
            }
        });
        
       
        

        JLabel background;
        ImageIcon img = new ImageIcon("Cultivate.jpg");
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,900,900);
        add(background);
       
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setTitle("Cultivate Of Crops/Fishes/Dairy");
  }
}