
package JFrame;

import javax.swing.JFrame;
public class FrameDemo extends JFrame {
    public static void main(String[] args) {
        
        FrameDemo frame=new FrameDemo();
        //if not extens then   JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(200, 50);
        frame.setLocationRelativeTo(null);
        frame.setBounds(200,50,400,300);
        frame.setTitle("developped amin");
        frame.setResizable(false);
        
    }
    
}
/* 
public class FrameDemo extends JFrame {
    
    FrameDemo()
    {
        setTitle("developped amin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,50,400,300);
    }

    public static void main(String[] args) {
        
        FrameDemo frame=new FrameDemo();
        frame.setVisible(true);
    
      
     
        
    }
    
}


*/