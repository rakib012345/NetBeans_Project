
package java_notepade;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Java_notepade extends JFrame {
    JTextArea mainarea;
    JMenuBar mbar;
    JMenu mnuFile ,mnuEdit,mnuFormat ,mnuHelp;
    JMenuItem  itmNew,itmOpen,itmSave;

    public Java_notepade() {
              initComponent();
    }
    
    private void initComponent (){
      mainarea = new JTextArea();
            getContentPane().add(mainarea);
            getContentPane().add(new JScrollPane(mainarea),BorderLayout.CENTER);
            setTitle("Untitle Notepade");
            setSize(800,600);
            mbar = new JMenuBar();
            mnuFile = new JMenu("File");
            mnuEdit = new JMenu("Edit");
            mnuFormat = new JMenu("Format");
            mnuHelp = new JMenu("Help");
            
            //ImageIcon newIcon = new ImageIcon(getClass().getResource("/img/new.JPG"));
           // ImageIcon openIcon = new ImageIcon(getClass().getResource("/img/open.JPG"));
          // ImageIcon saveIcon = new ImageIcon(getClass().getResource("/img/save.JPG"));
            
            itmNew = new JMenuItem("New");
            itmOpen = new JMenuItem("Open");
            itmSave = new JMenuItem("save");
            
            
            
            mnuFile.add(itmNew);
            mnuFile.add(itmOpen);
            mnuFile.add(itmSave);
            
            mbar.add(mnuFile);
            mbar.add(mnuEdit);
            mbar.add(mnuFormat);
            mbar.add(mnuHelp);
            setJMenuBar(mbar);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
    }
    
    

    public static void main(String[] args) {
        Java_notepade jn = new Java_notepade();
    }
    
}
