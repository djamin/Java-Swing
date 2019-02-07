package Layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener {

    private Container con;
    private JPanel panel;
    private JButton next, previous;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;

    SlideShowDemo() {
        simpleMethod();
        showImage();
    }

    public void simpleMethod() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 600, 500);
        this.setTitle("slideshow");
        con = this.getContentPane();
        con.setBackground(Color.PINK);
        con.setLayout(null);

        card = new CardLayout();

        panel = new JPanel(card);
        panel.setBounds(20, 20, 540, 300);
        con.add(panel);

        previous = new JButton("PREVIOUS");
        previous.setBounds(20, 340, 200, 60);
        con.add(previous);
        next = new JButton("NEXT");
        next.setBounds(365, 340, 200, 60);
        con.add(next);

        next.addActionListener(this);
        previous.addActionListener(this);

    }

    public void showImage() {
        String[] imageNames = {"1.jpg", "2.jpg", "3.jpg"};
        for (String n : imageNames) {
            icon = new ImageIcon("src/images/" + n);
            //resize image
            Image imge = icon.getImage();
            Image newimg = imge.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimg);
            label = new JLabel(icon);
            panel.add(label);
        }
    }

    public static void main(String[] args) {
        SlideShowDemo frame = new SlideShowDemo();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == previous) {
            card.previous(panel);
        }
        if (e.getSource() == next) {
            card.next(panel);
        }
    }
}
