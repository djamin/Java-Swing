
package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JButtonActionListener extends JFrame {
    private Container con;
    private JTextField text;
    private JButton btn;
    JButtonActionListener()
    {
        intiComponent();
    }
    public void intiComponent()
    {
        con=this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.DARK_GRAY);
        
        //---------------textField------------
        text=new JTextField();
        text.setBounds(40,40,400,30);
        con.add(text);
        //------------------button-------
        btn=new JButton("clear");
        btn.setBounds(40,70,400,30);
        con.add(btn);
        
        btn.addActionListener((ActionEvent e) -> {
            text.setText("");
        });
    }
    
    
    public static void main(String[] args) {
        JButtonActionListener fr=new JButtonActionListener();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("developer amin");
        fr.setBounds(400,100,800,500);
    }
}
