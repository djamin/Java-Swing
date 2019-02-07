package JButton;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {

    private JTextField text;
    private JLabel label1, label2;
    private JPasswordField pf;
    private JButton login, clear;
    private Container con;

    LoginForm() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 800, 500);
        this.setTitle("LOGING FORM");
        con = this.getContentPane();
        con.setLayout(null);
        Form();

    }

    public void Form() {

        text = new JTextField();
        text.setBounds(250, 40, 200, 30);
        con.add(text);

        label1 = new JLabel("USER NAME");
        label1.setBounds(40, 40, 200, 30);
        con.add(label1);

        label2 = new JLabel("password");
        label2.setBounds(40, 70, 200, 30);
        con.add(label2);

        pf = new JPasswordField();
        pf.setBounds(250, 70, 200, 30);
        con.add(pf);

        login = new JButton("LOGIN");
        login.setBounds(280, 120, 80, 30);
        con.add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(360, 120, 80, 30);
        con.add(clear);

        login.addActionListener((ActionEvent e) -> {

            String username = text.getText();
            String password = pf.getText();
            if (username.equals("ruhul amin") && (password.equals("523"))) {
                JOptionPane.showMessageDialog(null, "successfully login");
               // dispose();//first frame will close
               //show another form (  class_name object_name=new class_name();  )
               //object_name.setVisisble(true);
            } else {
                JOptionPane.showMessageDialog(null, "incorret");
            }

        });

        clear.addActionListener((ActionEvent e) -> {

            text.setText("");
            pf.setText("");
        });

    }

    public static void main(String[] args) {
        LoginForm frame = new LoginForm();
        frame.setVisible(true);
    }
}
