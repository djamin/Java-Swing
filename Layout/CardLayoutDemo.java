package Layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener {

    private Container con;
    private CardLayout cardl;
    private JButton btn1, btn2, btn3, btn4;

    CardLayoutDemo() {
        this.setTitle("Card LAYOUT DEMO");
        this.setBounds(10, 20, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SimpleMethod();

    }

    public void SimpleMethod() {
        con = this.getContentPane();
        cardl = new CardLayout();
                cardl = new CardLayout(5,5);

        con.setLayout(cardl);

        btn1 = new JButton("hello");
        btn2 = new JButton("hi");
        btn3 = new JButton("welcome");
        btn4 = new JButton("goodbye");

        con.add(btn1, "First");
        con.add(btn2, "second");
        con.add(btn3, "third");
        con.add(btn4, "fourth");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //cardl.previous(con);
        cardl.next(con);
        //cardl.first(con);
        //cardl.last(con);
        cardl.show(con, "third");
        
    }

    public static void main(String[] args) {
        CardLayoutDemo frame = new CardLayoutDemo();
        frame.setVisible(true);

    }

}
