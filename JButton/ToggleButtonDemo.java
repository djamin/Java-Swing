
package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ToggleButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame implements ActionListener{
    private Container con; 
    private JToggleButton tb;
    private JLabel lb;
    
    ToggleButtonDemo()
    {
        this.setBounds(10,10,300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("this is ToggleButton");
        con=this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);
        simpleMethod();
    }
    public void simpleMethod()
    {
        tb=new JToggleButton("off");
        tb.setBounds(20,20,250,100);
        con.add(tb);
        
        lb=new JLabel();
        lb.setBounds(20,150,200,60);
        con.add(lb);
        
        tb.addActionListener(this);
    }
    public static void main(String[] args) {
        ToggleButtonDemo frame=new ToggleButtonDemo();
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected())
        {
            lb.setText("this is on");
            tb.setText("ON");
        }
        else{
            lb.setText("this is off");
            tb.setText("OFF");
        }
    }
}