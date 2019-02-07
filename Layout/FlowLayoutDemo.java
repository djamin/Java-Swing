package Layout;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

    private FlowLayout fl;
    private Container con;
    private JButton btn[];

    FlowLayoutDemo() {
        this.setTitle("Flow LAYOUT DEMO");
        this.setBounds(10, 20, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SimpleMethod();
    }

    public void SimpleMethod() {
        con = this.getContentPane();
        fl = new FlowLayout();
        //fl = new FlowLayout(FlowLayout.LEFT);

        con.setLayout(fl);

        btn = new JButton[9];
        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton("" + (i + 1));
            con.add(btn[i]);

        }
    }

    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
    }
}
