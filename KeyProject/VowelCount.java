package KeyProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCount extends JFrame {

    private Container con;
    private JLabel status, totalcount, acount, ecount, icount, ocount, ucount;
    private JTextArea tarea;
    private JScrollPane scroll;
    int tv = 0;
    int ta = 0;
    int te = 0;
    int ti = 0;
    int to = 0;
    int tu = 0;

    VowelCount() {

        this.setBounds(20, 20, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Vowel Countable Table");
        this.setBackground(Color.PINK);
        con = this.getContentPane();
        con.setLayout(null);
        VowelMethod();

    }

    public void VowelMethod() {
        tarea = new JTextArea();
        con.add(tarea);
        scroll = new JScrollPane(tarea);
        scroll.setBounds(20, 50, 350, 60);
        scroll.setAutoscrolls(true);
        con.add(scroll);

        status = new JLabel("ENTER ANY WORD OR SENTENCE");
        status.setBounds(20, 20, 350, 30);
        con.add(status);

        totalcount = new JLabel("TOTAL COUNTABLE VOWEL : ");
        totalcount.setBounds(20, 120, 350, 30);
        con.add(totalcount);

        acount = new JLabel("COUNTABLE A VOWEL : ");
        acount.setBounds(20, 160, 350, 30);
        con.add(acount);

        ecount = new JLabel("COUNTABLE E VOWEL : ");
        ecount.setBounds(20, 200, 350, 30);
        con.add(ecount);

        icount = new JLabel("COUNTABLE I VOWEL : ");
        icount.setBounds(20, 240, 350, 30);
        con.add(icount);

        ocount = new JLabel("COUNTABLE O VOWEL : ");
        ocount.setBounds(20, 280, 350, 30);
        con.add(ocount);

        ucount = new JLabel("COUNTABLE U VOWEL : ");
        ucount.setBounds(20, 320, 350, 30);
        con.add(ucount);

        tarea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                
                tarea.setText(" ");
                if (e.getSource() == tarea) {

                    if (e.VK_A == e.getKeyCode()) {
                        tv++;
                        ta++;
                    } else if (e.VK_E == e.getKeyCode()) {
                        tv++;
                        te++;
                    } else if (e.VK_I == e.getKeyCode()) {
                        tv++;
                        ti++;
                    } else if (e.VK_O == e.getKeyCode()) {
                        tv++;
                        to++;
                    } else if (e.VK_U == e.getKeyCode()) {
                        tv++;
                        tu++;
                    }

                    totalcount.setText("Total number of vowel =  " + tv);
                    acount.setText("Total number of a =   " + ta);
                    ecount.setText("Total number of e =   " + te);
                    icount.setText("Total number of i =   " + ti);
                    ocount.setText("Total number of o =   " + to);
                    ucount.setText("Total number of u =   " + tu);

                }
              

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });
    }

    public static void main(String[] args) {
        VowelCount frame = new VowelCount();
        frame.setVisible(true);

    }
}
