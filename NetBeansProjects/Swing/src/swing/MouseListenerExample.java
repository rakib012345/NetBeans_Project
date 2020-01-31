
package swing;


import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JTextField;
public class MouseListenerExample extends JmenuExample implements MouseListener{  
    JTextField f1;  
  
 MouseListenerExample(){  
        addMouseListener(this);  
          
        f1=new JTextField();  
        f1.setBounds(400,30,400,300);  
        add(f1);  
        setLayout(null);  
        setVisible(true);  
        setVisible(false);
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),40,100);
    }  
    public void mouseEntered(MouseEvent e) {  
        f1.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
       f1.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        f1.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        f1.setText("Mouse Released");  
    }  
}