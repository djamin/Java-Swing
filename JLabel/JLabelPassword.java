/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;



public class JLabelPassword extends JFrame {
    private Container con;
    private JPasswordField pf;
    private Font font;
    
    JLabelPassword(){
        initComponent();
    }
    public void initComponent(){
        con=this.getContentPane();
        con.setLayout(null);
        //-----------font----------------
        font =new Font("arial",Font.BOLD,14);
  
        //--------password field---------
        pf=new JPasswordField();
        pf.setBounds(40,40,400,30); 
        pf.setEchoChar('&');
        pf.setForeground(Color.RED);
        pf.setBackground(Color.BLACK);
        pf.setFont(font);
        con.add(pf);
       
    }
    
    
    public static void main(String[] args) {
        JLabelPassword frame=new JLabelPassword();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("developper amin");
        frame.setBounds(400,100,800,500);
        
    }
    
}
