
package Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class WindowListenerDemo extends JFrame {
    private Container con;
    WindowListenerDemo(){
        this.setTitle("window listener");
        this.setBounds(20,20,400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con=this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.BLUE);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
               System.out.println("window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                               System.out.println("window closing");

            }

            @Override
            public void windowClosed(WindowEvent e) {
                               System.out.println("window closed");

            }

            @Override
            public void windowIconified(WindowEvent e) {
                               System.out.println("window Iconified");

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                               System.out.println("window Deiconfied");

            }

            @Override
            public void windowActivated(WindowEvent e) {
                               System.out.println("window activated");

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                               System.out.println("window deactivated");

            }
        
        });
                
    }
    public static void main(String[] args) {
        WindowListenerDemo frame=new WindowListenerDemo();
        frame.setVisible(true);
    }
    
    
}
