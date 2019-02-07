package JTextArea;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private Container con;
    private Font font;
    private JLabel imageLabel, textLabel;
    private ImageIcon imageIcon;
    private JTextField tf;
    private JButton btn;
    private JTextArea ta;
    private JScrollPane scroll;

    MultiplicationTable() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MULTIPLICATION");
        this.setBounds(20, 20, 400, 650);
        con = this.getContentPane();
        con.setLayout(null);
        MultiMethod();
    }

    public void MultiMethod() {
        font = new Font("arial", Font.BOLD, 14);

        //------------set image----------
        imageIcon = new ImageIcon(getClass().getResource("multitable.jpg"));
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(10, 10, 360, 100);
        con.add(imageLabel);

        //-----------set textLabel--------
        textLabel = new JLabel("ENTER ANY INTEGER NUMBER ");
        textLabel.setBounds(10, 120, 200, 60);
        con.add(textLabel);

        //---------set textField----------
        tf = new JTextField();
        tf.setBounds(250, 140, 120, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        con.add(tf);

        //----------button add------------
        btn = new JButton("CLEAR");
        btn.setBounds(250, 200, 120, 50);
        con.add(btn);

        //--------text area----
        ta = new JTextArea();
        con.add(ta);

        // scroll view----------
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 270, 340, 320);
        con.add(scroll);

        //-------------------------------------------code handeling----------------------------------
        tf.addActionListener((ActionEvent e) -> {

            String data = tf.getText();
            if (data.isEmpty()) {
                JOptionPane.showMessageDialog(null, "input integer");
            }
            
            else {
                ta.setText("");
                int num = Integer.parseInt(tf.getText());///string to integer.
                for (int i = 1; i <= 100; i++) {
                    int result = num * i;
                    String r = String.valueOf(result);//int to string
                    String n = String.valueOf(num);
                    String increment = String.valueOf(i);

                    ta.append(n + "*" + increment + "=" + r + "\n");
                }

            }

        });
        
        btn.addActionListener((ActionEvent e)->{
            ta.setText("");
            tf.setText("");
        });
    }

    public static void main(String[] args) {
        MultiplicationTable mainFrame = new MultiplicationTable();
        mainFrame.setVisible(true);
    }
}
