
package JTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextArea extends JFrame{
    
    private JTextArea ta;
    private JScrollPane scroll;
    private Container con;
    private JButton btn1,btn2;
    
    TextArea(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Area work");
        this.setBounds(20,20,1000,600);
        con=this.getContentPane();
        con.setLayout(null);
        Textarea();
    }
    public void Textarea(){
        
        ta=new JTextArea();
        ta.setForeground(Color.PINK);
        ta.setBackground(Color.darkGray);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        con.add(ta);
        
        scroll=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(20,20,800,400);
        con.add(scroll);
        
        btn1=new JButton ("save");
        btn1.setBounds(100,450,200,60);
        con.add(btn1);
        
        
        btn2=new JButton ("clear");
        btn2.setBounds(350,450,200,60);
        con.add(btn2);
        
        btn1.addActionListener((ActionEvent e)->{
        
            String s = ta.getText();
            
                if(s!= null)
                {
                    JOptionPane.showMessageDialog(null,"saved successfully");  
                }
                else{
                    //doesn't work why??
                    JOptionPane.showMessageDialog(null,"write something"); 
                }
        });
        
        btn2.addActionListener((ActionEvent e)->{
            ta.setText(" ");
        });
        
        
    }
    public static void main(String[] args) {
        TextArea backOption=new TextArea();
        backOption.setVisible(true);
    }
    
}
