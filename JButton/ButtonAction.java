package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonAction extends JFrame implements ActionListener {

    private JButton btn1, btn2, btn3;
    private Container con;

    ButtonAction() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20, 20, 400, 340);
        this.setTitle("NEW ACTION LISTENER");
        con = this.getContentPane();
        con.setLayout(null);

        btn1 = new JButton("RED");
        btn1.setBounds(80, 40, 200, 60);
        con.add(btn1);

        btn2 = new JButton("blue");
        btn2.setBounds(80, 120, 200, 60);
        con.add(btn2);

        btn3 = new JButton("pink");
        btn3.setBounds(80, 200, 200, 60);
        con.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }

    public static void main(String[] args) {
        ButtonAction frame = new ButtonAction();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource()==btn1)
    {
        con.setBackground(Color.RED);
    }
    if(e.getSource()==btn2)
    {
        con.setBackground(Color.BLUE);
    }
    else
    {
        con.setBackground(Color.pink);
    }
    
    
    
    }
}
