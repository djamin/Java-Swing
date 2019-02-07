package JButton;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButton extends JFrame {

    private Container con;
    private JRadioButton rb1, rb2, rb3, rb4;
    private ButtonGroup grp;
    private JTextArea ta;

    RadioButton() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20, 20, 400, 600);
        this.setTitle("Radio Button");
        con = this.getContentPane();
        con.setLayout(null);
        ButtonWorking();
    }

    public void ButtonWorking() {
        rb1 = new JRadioButton("easy");
        rb1.setBounds(10, 10, 200, 40);
        con.add(rb1);

        rb2 = new JRadioButton("medium");
        rb2.setBounds(10, 60, 200, 40);
        con.add(rb2);

        rb3 = new JRadioButton("hard");
        rb3.setBounds(10, 110, 200, 40);
        //rb3.setEnabled(false);
        con.add(rb3);

        rb4 = new JRadioButton("very hard");
        rb4.setBounds(10, 160, 200, 40);
        rb4.setSelected(true);//default selected
        con.add(rb4);
        

        grp = new ButtonGroup();
        grp.add(rb1);
        grp.add(rb2);
        grp.add(rb3);
        grp.add(rb4);
        
        ta=new JTextArea();
        ta.setBounds(10,220,300,100);
        con.add(ta);

        Handaler handel = new Handaler();
        rb1.addActionListener(handel);
        rb2.addActionListener(handel);
        rb3.addActionListener(handel);
        rb4.addActionListener(handel);
    }

    class Handaler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

         String one = rb1.getText();
            String two = rb2.getText();
            String three = rb3.getText();
            String four = rb4.getText();
           if (e.getSource() == rb1) {
               // JOptionPane.showMessageDialog(null, "selected" + one);
                ta.append("you are selected :"+one+"\n");
            } else if (e.getSource() == rb2) {
                //JOptionPane.showMessageDialog(null, "selected" + two);
                ta.append("you are selected :"+two+"\n");
            } else if (e.getSource() == rb3) {
                //JOptionPane.showMessageDialog(null, "selected" + three);
                ta.append("you are selected :"+three+"\n");
            } else {
                //JOptionPane.showMessageDialog(null, "selected" + four);
                ta.append("you are selected :"+four+"\n");
            }
        
            
        
        
        }

    }

    public static void main(String[] args) {
        RadioButton frame = new RadioButton();
        frame.setVisible(true);
    }
}
