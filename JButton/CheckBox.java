package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox extends JFrame {

    private Container con;
    private JCheckBox cbjava, cbpython, cblarabel;
    private JLabel label;
    private ButtonGroup grp;

    CheckBox() {

        this.setTitle("CHECKBOX");
        this.setBounds(20, 20, 400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);

        cbjava = new JCheckBox("java");
        cbpython = new JCheckBox("pyton");
        cblarabel = new JCheckBox("larabel");
        label = new JLabel("select someOne");
        grp = new ButtonGroup();

        cbjava.setBounds(20, 20, 200, 30);
        cbpython.setBounds(20, 60, 200, 30);
        cblarabel.setBounds(20, 100, 200, 30);
        label.setBounds(20, 140, 200, 30);

        grp.add(cbjava);
        grp.add(cbpython);
        grp.add(cblarabel);
        con.add(cbjava);
        con.add(cbpython);
        con.add(cblarabel);
        con.add(label);

        Control control = new Control();

        cbjava.addItemListener(control);
        cbpython.addItemListener(control);
        cblarabel.addItemListener(control);

    }

    class Control implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource()==cbjava)
            {
                label.setText("selected java");
            }
            else if (e.getSource()==cbpython)
            {
                label.setText("selected phython");
            }
            else{
                label.setText("selected larabel");
            }
        }

    }

    public static void main(String[] args) {
        CheckBox frame = new CheckBox();
        frame.setVisible(true);

    }
}
