
package swing_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing_1 {
    JFrame f;
    JLabel lb1;
    JButton b1;

    public Swing_1() {
        f = new JFrame();
        lb1 =  new JLabel("Hellow");
        b1 = new JButton("click");
        lb1.setBounds(20,40,30,70);
        b1.setBounds(10,30,30,50);
        f.add(b1);
        f.add(lb1);
        f.setSize(400,500);
        f.setTitle("fuking swing");
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {

        new Swing_1();
        
    }
    
}
