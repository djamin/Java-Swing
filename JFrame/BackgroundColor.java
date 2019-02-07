
package JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
public class BackgroundColor extends JFrame {
    private ImageIcon img;
    private Container con;//for background color
    BackgroundColor()
    {
        initComponent();
        
    }
    public void initComponent(){
        
        con=this.getContentPane();
       con.setBackground(Color.blue);
        img=new ImageIcon(getClass().getResource("image.png"));
        
        this.setIconImage(img.getImage());
    }
    public static void main(String[] args) {
        BackgroundColor bg = new BackgroundColor();
        bg.setVisible(true);
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bg.setBounds(200, 40,400,300);
    }
}
