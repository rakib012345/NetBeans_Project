
package frist;


import javax.swing.JFrame;


public class Trywindows {
    
    static JFrame aWindow = new JFrame("dsrttydgf");
    
            public static void main(String[] args){
            int windowWidth = 500;
            int windowHight =150;
              
              aWindow.setBounds(50,100, windowWidth, windowHight);
              aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             // aWindow.setLocationRelativeTo(null);
              aWindow.setVisible(true);
                       
            }
}
