package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonDemo extends JFrame {

    private Container con;
    private JButton button;
    private Cursor cursor;
    private ImageIcon img;
    JButtonDemo() {
        initComponent();
    }

    public void initComponent() {
        
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.pink);
        //-----------------cursor using-------------
        cursor = new Cursor(Cursor.TEXT_CURSOR);
       //===========image set===============
       img=new ImageIcon(getClass().getResource("image.png"));
       
        button=new JButton(img);
        button.setBounds(40,10,200,100);
        button.setCursor(cursor);
        con.add(button);
        
    }

    public static void main(String[] args) {
        JButtonDemo frame = new JButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 800, 500);
        frame.setTitle("developped amin");
    }

}
