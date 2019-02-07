
package JFrame;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class JFrameIcon extends JFrame{
    
    private ImageIcon icon;
    
    JFrameIcon(){
        initComponent();
    }
    public void initComponent(){
        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());//must calles getImage()method.
        
                
    }
    
    
    public static void main(String[] args) {
        JFrameIcon frame=new JFrameIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("developper amjin");
        
        
    }

  

 
}
