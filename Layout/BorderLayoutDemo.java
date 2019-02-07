package Layout;

import java.awt.BorderLayout;
import java.awt.Container;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

    private JButton Nbtn, Ebtn, Sbtn, Cbtn, Wbtn;
    private Container con;
    private BorderLayout bl;

    BorderLayoutDemo() {

        this.setTitle("BORDER LAYOUT DEMO");
        this.setBounds(10, 20, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SimpleMethod();
    }

    public void SimpleMethod() {
        con = this.getContentPane();
        bl = new BorderLayout();
        //bl = new BorderLayout(10,5);//or following method  setHgap, setVgap.
        bl.setHgap(5);
        bl.setVgap(10);

        con.setLayout(bl);

        Nbtn = new JButton("NORTH");
        Sbtn = new JButton("EAST");
        Ebtn = new JButton("EAST");
        Wbtn = new JButton("WEST");
        Cbtn = new JButton("CENTER");

        con.add(Nbtn, BorderLayout.NORTH);
        con.add(Sbtn, BorderLayout.SOUTH);
        con.add(Ebtn, BorderLayout.EAST);
        con.add(Wbtn, BorderLayout.WEST);
        con.add(Cbtn, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
    }
}
