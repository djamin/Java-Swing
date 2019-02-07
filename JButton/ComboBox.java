
package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



public class ComboBox extends JFrame{
    private Container con;
    private JComboBox jcb;
    private String[] prolang={"c","java","php","c#"};
    private JButton btn;
   private JTextArea ta;
    
    ComboBox(){
        this.setTitle("CHECKBOX");
        this.setBounds(20, 20, 500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);
        ComboMethod();
        
        
    }
    public void ComboMethod(){
        jcb=new JComboBox(prolang);
        jcb.setBounds(40,20,300,60);
        jcb.setEditable(true);
        // jcb.setSelectedIndex(2);
        //jcb.setSelectedItem("java");
        //jcb.addItem("hello");
        //jcb.removeItem("hello");
        //jcb.removeItemAt(3);
        //jcb.removeAllItems();
        con.add(jcb);
        
        btn=new JButton("SHOW");
        btn.setBounds(40,100,300,60);
        con.add(btn);
        
        
        ta=new JTextArea();
        ta.setBounds(40,180,300,100);
        con.add(ta);
       
        btn.addActionListener((ActionEvent e)->{
        
            String s=jcb.getSelectedItem().toString();
            ta.setText("your item is : "+s);
        
        
        });       
    }
    
    
    public static void main(String[] args) {
        
        ComboBox frame=new ComboBox();
        frame.setVisible(true);
    }
    
}
