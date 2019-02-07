package JPanel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame {

    private Container con;
    private JPanel p1, p2;
    private JButton btn1,btn2,btn3;

    JPanelDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("JPANEL DEMO");
        this.setBounds(20, 20, 500, 400);
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);

        p1 = new JPanel();
        p1.setBounds(20, 60, 200, 250);
        p1.setBackground(Color.RED);
        con.add(p1);

        p2 = new JPanel();
        p2.setBounds(240, 60, 200, 250);
        p2.setBackground(Color.RED);
        con.add(p2);
        
        btn1=new JButton("hi");
        con.add(btn1);
        btn2=new JButton("ok");
        con.add(btn2);
        btn3=new JButton("hy");
        con.add(btn3);
        
        p1.add(btn1);
        p1.add(btn2);
        p2.add(btn3);
                

    }

    public static void main(String[] args) {
        JPanelDemo frame = new JPanelDemo();
        frame.setVisible(true);
    }
}
