
package Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MouseMotionListenerDemo extends JFrame{
     private Container con;
    private JTextField tf;
    private JTextArea ta;
    
    MouseMotionListenerDemo(){
        this.setTitle("MOUSE MOTION LISTENER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,400,600);
        con=this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);
        
        
        MotionMethod();
    }
    public void MotionMethod()
    {
        tf=new JTextField();
        tf.setBounds(20,40,350,60);
        con.add(tf);
        
        ta=new JTextArea();
        ta.setBounds(20,120,350,400);
        con.add(ta);
        
        
        ta.addMouseMotionListener(new MouseMotionListener (){
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Dragged: "+e.getX()+" "+e.getY());
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse moved: "+e.getX()+" "+e.getY());

            }
        
        
        });
       
        
       
    }
    
    public static void main(String[] args) {
        MouseMotionListenerDemo frame=new MouseMotionListenerDemo();
        frame.setVisible(true);
    }
}
