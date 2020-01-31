
package eventhandling;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class KeyHandling extends JFrame implements KeyListener{
    
    JFrame frame;
    JTextArea Area;
    JLabel l;
    
    public KeyHandling(){

         frame = new JFrame();
         l=new JLabel(); 
         Area=new JTextArea();
         
         
         l.setBounds(20,50,100,20);   
         Area.setBounds(20,80,300, 300);  
         
        add(l);
        add(Area);
        Area.addKeyListener(this);
        setSize(400,400);  
        setLayout(null);  
        setVisible(true); 
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        

    }
    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Key Pressed");  
    }

    @Override
    public void keyPressed(KeyEvent e) {
       l.setText("Key Released"); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text=Area.getText();  
        String words[]=text.split("\\s");  
        l.setText("Words: "+words.length+" Characters:"+text.length());  
    }
    public static void main(String[] args) {
        new KeyHandling();
    }
}
