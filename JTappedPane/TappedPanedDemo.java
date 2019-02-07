package JTappedPane;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TappedPanedDemo extends JFrame {

    private Container con;
    private JTabbedPane tp;
    private JPanel pan1, pan2, pan3;
 

    TappedPanedDemo() {
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.BLACK);

        tp = new JTabbedPane();
        // tp = new JTabbedPane(JTabbedPane.BOTTOM);
        //tp.setTabPlacement();

        tp.setBounds(20, 40, 400, 250);
        tp.setBackground(Color.PINK);
        con.add(tp);
        
        
        
        pan1 = new JPanel();
        pan1.setBackground(Color.GREEN);
        pan2 = new JPanel();
        pan2.setBackground(Color.LIGHT_GRAY);
        pan3 = new JPanel();
        pan3.setBackground(Color.RED);

        tp.addTab("HOME", pan1);
        tp.addTab("EDIT", pan2);
        tp.addTab("ABOUT", pan3);

    }

    public static void main(String[] args) {
        TappedPanedDemo frame = new TappedPanedDemo();
        frame.setVisible(true);
        frame.setTitle("Tapped Paned");
        frame.setBounds(20, 20, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
