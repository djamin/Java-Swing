
package Listener;

import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.MouseListener;


public class MouseListenerDemo extends JFrame {
    private Container con;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    MouseListenerDemo(){
        this.setTitle("MOUSE LISTENER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,400,600);
        con=this.getContentPane();
        con.setLayout(null);
        MouseMethod();
    }
    public void MouseMethod(){
        tf=new JTextField();
        tf.setBounds(20,40,350,60);
        con.add(tf);
        
        ta=new JTextArea();
        con.add(ta);
        
        scroll = new JScrollPane(ta);
        scroll.setBounds(20,120,350,400);
        scroll.setAutoscrolls(true);
        con.add(scroll);
        
      tf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
              ta.append("Mouse clicked \n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            ta.append("Mouse pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
              ta.append("Mouse released\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              ta.append("Mouse enterd\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
              ta.append("Mouse exited\n");
            }
      
      
      });
    }
    
    public static void main(String[] args) {
        MouseListenerDemo frame=new MouseListenerDemo();
        frame.setVisible(true);
        
    }
}
