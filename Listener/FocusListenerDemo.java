package Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FocusListenerDemo extends JFrame {

    private Container con;
    private JTextArea ta;
    private JButton btn;

    FocusListenerDemo() {
        this.setBounds(20, 20, 700, 400);
        this.setTitle("Focus Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);
        SimpleMethod();
    }

    public void SimpleMethod() {

        btn = new JButton("clicked");
        btn.setBounds(20, 40, 280, 60);
        con.add(btn);

        ta= new JTextArea();
        ta.setBounds(360, 40, 250, 60);
        con.add(ta);
        
        
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
              ta.setText("focus gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
              ta.setText("focus lost");
            }
        
        
        });
    }

    public static void main(String[] args) {
        FocusListenerDemo frame = new FocusListenerDemo();
        frame.setVisible(true);
    }
}
