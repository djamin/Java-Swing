package Layout;

import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame {

    private Container con;
    private BoxLayout box;
    private JButton btn1, btn2, btn3, btn4, btn5;

    BoxLayoutDemo() {
        this.setTitle("Box LAYOUT DEMO");
        this.setBounds(10, 20, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SimpleMethod();
    }

    public void SimpleMethod() {
        con = this.getContentPane();
        box = new BoxLayout(con, BoxLayout.Y_AXIS);
        //box = new BoxLayout(con, BoxLayout.X_AXIS);

        con.setLayout(box);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        con.add(btn1);
        // con.add(Box.createHorizontalStrut(20));
        con.add(btn2);
        con.add(btn3);
        con.add(btn4);
        // con.add(Box.createVerticalStrut(5));
        con.add(btn5);

    }

    public static void main(String[] args) {

        BoxLayoutDemo frame = new BoxLayoutDemo();
        frame.setVisible(true);
    }

}
