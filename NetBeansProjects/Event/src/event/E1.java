
package event;
 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static sun.net.www.http.HttpClient.New;


public class E1  extends JFrame {
    JButton btn1,btn2;
    
    public E1(){
        btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");
                         
        btn1.setBounds(50,20,50,30);
        btn2.setBounds(150,20,50,30);
        
            setSize(500,500);
            setLayout(new FlowLayout());
            getContentPane().add(btn1);
            getContentPane().add(btn2);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    
            btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane,"hello");
            }
        });
            btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(rootPane, "New messege", "New TItle", JOptionPane.INFORMATION_MESSAGE );
            }
        });
    
    }
        public static void main(String[] args){
        
         // E1 e= new E1();
           E2 r= new E2();
           r.setVisible(true);
          // e.setVisible(true);
        
        }
    
}
