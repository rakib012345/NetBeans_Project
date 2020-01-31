/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.*;
import java.awt.Container;
import javax.swing.*;


public class frame {
    public static void main(String[] args) {
        JFrame frame=new  JFrame();
        Container con=frame.getContentPane();
        frame.setLayout(null); 
        frame.setVisible(true);
        frame.setBounds(10,10,1000,500);
        Button bt=new Button("hello");
        
    }

    
}
