
package JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JLabelTextField extends JFrame{
    
    private JTextField text_one,text_two;
    private Container con;
    private Font font;
    
    JLabelTextField(){
        initContent();
    }
    public void initContent(){
        con =this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.pink);
        //-----------font----------
        font=new Font("arial",Font.BOLD+Font.PLAIN,14);
        
        //----------textfiled one---------
        text_one=new JTextField();
        text_one.setBounds(30,30,300,30);
        text_one.setFont(font);
        text_one.setForeground(Color.red);
        text_one.setBackground(Color.BLUE);
        con.add(text_one);
        //-----------textfield two--------
        text_two=new JTextField("write somethig");                                                 
        text_two.setBounds(30,60,300,30);
        text_two.setFont(font);
        text_two.setHorizontalAlignment(JTextField.CENTER);
        con.add(text_two);
        
        
        //---------------------action lisenter----------------------
        
        text_two.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                String s=text_two.getText();
                if(s.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"input something");
                }
                else{
                    JOptionPane.showMessageDialog(null,"text_two"+" "+s);
                }
            }
        
        });
        
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        JLabelTextField frame=new JLabelTextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,500);
        frame.setTitle("developped amin");
    }
    
}
 /*  text_two.setText("hello amin");
    String s=text_two.getText();
    System.out.println(" "+s);*/