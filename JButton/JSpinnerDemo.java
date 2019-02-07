
package JButton;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerDemo  extends JFrame implements ChangeListener{
    private Container con;
    private JSpinner spin;
    private JLabel label;
    JSpinnerDemo()
    {
        con=this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);
        
        SpinnerNumberModel val=new SpinnerNumberModel(0,-20,20,5);
        spin=new JSpinner(val);
        spin.setBounds(20,20,100,60);
        con.add(spin);
        
        label=new JLabel("conting number");
        label.setBounds(20,100,200,60);
        con.add(label);
    
        spin.addChangeListener(this);
    }
    
      @Override
    public void stateChanged(ChangeEvent e) {
    
        String value=spin.getValue().toString();
        int number=Integer.parseInt(value);
        label.setText("current Number: "+number);
        
    }
    public static void main(String[] args) {
        JSpinnerDemo frame=new JSpinnerDemo();
        frame.setVisible(true);
        frame.setTitle("SLIDER DEMO");
        frame.setBounds(20, 20, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}
