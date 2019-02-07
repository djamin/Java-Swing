package Layout;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {

    private Container con;
    private GridLayout glayout;
    private JButton btn1, btn2, btn3, btn4;

    GridLayoutDemo() {
        this.setTitle("Grid LAYOUT DEMO");
        this.setBounds(10, 20, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SimpleMethod();

    }

    public void SimpleMethod() {
        con = this.getContentPane();
        glayout = new GridLayout(2, 2);
        glayout = new GridLayout(2, 2, 5, 5);

        con.setLayout(glayout);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");

        con.add(btn1);
        con.add(btn2);
        con.add(btn3);
        con.add(btn4);

    }

    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setVisible(true);

    }

}
