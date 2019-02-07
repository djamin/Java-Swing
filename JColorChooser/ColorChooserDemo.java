
package JColorChooser;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserDemo extends JFrame {
    private Container con;
    private JButton btn;

    ColorChooserDemo()
    {
        con=this.getContentPane();
        con.setLayout(null);
        
        btn=new JButton("Choose a Color");
        btn.setBounds(20,20,300,200);
        con.add(btn);
        
        btn.addActionListener((ActionEvent e)->{
            Color color=JColorChooser.showDialog(null,"select a color", Color.pink);
            con.setBackground(color);
        });
    }
    public static void main(String[] args) {
        ColorChooserDemo frame=new ColorChooserDemo();
        frame.setVisible(true);
        frame.setTitle("Tapped Paned");
        frame.setBounds(20, 20, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
