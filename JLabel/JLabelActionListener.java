package JLabel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class JLabelActionListener extends JFrame {

    private Container con;
    private JTextField text1, text2;

    JLabelActionListener() {
        initComponet();
    }

    public void initComponet() {
        con = this.getContentPane();
        con.setLayout(null);

        //------------text-----------
        text1 = new JTextField();
        text2 = new JTextField();
        text1.setBounds(30, 30, 300, 30);
        text2.setBounds(30, 60, 300, 30);
        con.add(text1);
        con.add(text2);
        //-------------actionlistenter add--------------

        Controler control = new Controler();
        text1.addActionListener(control);
        text2.addActionListener(control);
    }

    class Controler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == text1) {
                String s = text1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "input something");
                } else {
                    JOptionPane.showMessageDialog(null, "text_one" + " " + s);
                }
            } else {
                String s = text2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "input something");
                } else {
                    JOptionPane.showMessageDialog(null, "text_two" + " " + s);
                }
            }

        }

    }

    public static void main(String[] args) {
        JLabelActionListener frame = new JLabelActionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 800, 500);
        frame.setTitle("developped amin");

    }
}
