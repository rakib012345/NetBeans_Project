
package cutivate;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Crops {
    public static void main(String[] args) {
        cropstable obj = new cropstable();
        Button obj1 = new Button();
        obj1.setVisible(true);
    }
}
class cropstable extends JFrame implements ActionListener{
    
    private JTable table;
    private JScrollPane sroll;
    private DefaultTableModel model;
    private Container c;
    private JLabel titleLable,fnLable,lnlable,pLable,adLable;
    private JButton addButton,upButton,deleteButton,clearButtton;
    private JTextField fnTf,lnTf,pnTf,adTf;
    
    private String[] columns ={"Crops Name","Rate/Kg","Buy","Sell"};
    private String[] rows = new String[4];
    
    cropstable() {
        initComponents();
    }

    private void initComponents() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setTitle("Cultivator");
 
        
        JButton b3 = new JButton("Back");
        Font font1 = new Font("Arial",Font.BOLD,16);
        b3.setBounds(700, 50, 80, 40);
        b3.setBackground(Color.green);
        b3.setFont(font1);
        add(b3);
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new Button();
            }
        });
        
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        c.setSize(700,800);
        
        Font font = new Font("Arial",Font.BOLD,16);
        
        titleLable = new JLabel("Cultivate Of Crops/Dairy/Fishes");
        titleLable.setBounds(150,10,400,50);
        titleLable.setFont(font);
        c.add(titleLable);
        
        fnLable = new JLabel("Crops Name");
        fnLable.setBounds(10,50,100,30);
        fnLable.setFont(font);
        c.add(fnLable);
        
        fnTf = new JTextField("");
        fnTf.setBounds(140,50,120,30);
        fnTf.setFont(font);
        c.add(fnTf);    
        
        addButton = new JButton("ADD");
        addButton.setBounds(320,50,100,40);
        addButton.setFont(font);
        c.add(addButton); 
        
        
        lnlable = new JLabel("Rate / Kg");
        lnlable.setBounds(10,110,100,30);
        lnlable.setFont(font);
        c.add(lnlable);
        
        lnTf = new JTextField("");
        lnTf.setBounds(140,110,120,30);
        lnTf.setFont(font);
        c.add(lnTf);
        
        upButton = new JButton("Update");
        upButton.setBounds(320,110,100,40);
        upButton.setFont(font);
        c.add(upButton);
        
        pLable = new JLabel("Buy / Month");
        pLable.setBounds(10,170,120,30);
        pLable.setFont(font);
        c.add(pLable);
        
        pnTf = new JTextField("");
        pnTf.setBounds(140,170,120,30);
        pnTf.setFont(font);
        c.add(pnTf);       

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(320,170,100,40);
        deleteButton.setFont(font);
        c.add(deleteButton);
        
        adLable = new JLabel("Sell / Month");
        adLable.setBounds(10,230,120,30);
        adLable.setFont(font);
        c.add(adLable);
        
        adTf = new JTextField("");
        adTf.setBounds(140,230,120,30);
        adTf.setFont(font);
        c.add(adTf); 

        clearButtton = new JButton("Clear");
        clearButtton.setBounds(320,230,100,40);
        clearButtton.setFont(font);
        c.add(clearButtton);
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.lightGray);
        table.setBackground(Color.red);
        table.setRowHeight(30);
        
        sroll = new JScrollPane(table);
        sroll.setBounds(10,300, 850, 500);
        c.add(sroll);
        
        addButton.addActionListener(this);
        clearButtton.addActionListener(this);
        deleteButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {
            
            public void mouseClocked (MouseEvent me)
            {
            int numberOfRow = table.getSelectedRow();
            
            
            String f_name = model.getValueAt(numberOfRow, 0).toString();
            String l_name = model.getValueAt(numberOfRow, 1).toString();
            String phone = model.getValueAt(numberOfRow, 2).toString();
            String adress = model.getValueAt(numberOfRow, 3).toString();
            
            fnTf.setText(f_name);
            lnTf.setText(l_name);
            pnTf.setText(phone);
            adTf.setText(adress);
            
            }            
       });
             
      }
    
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==addButton){
        
            rows[0]=fnTf.getText();
            rows[1]=lnTf.getText();
            rows[2]=pnTf.getText();
            rows[3]=adTf.getText();   
            model.addRow(rows);
        }
        else if(e.getSource()==clearButtton){
            fnTf.setText("");
            lnTf.setText("");
            pnTf.setText("");
            adTf.setText("");
        }
        else if(e.getSource()==deleteButton){
        
            int numberOfRow = table.getSelectedRow();
            
            if(numberOfRow>=0)
            {
              model.removeRow(numberOfRow);
            }
            else{
                JOptionPane.showMessageDialog(null, "No information");
            }
        }
        
    }
    
 

    
}
